package in.co.nmsworks.log4j2.examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kamal (kamal@nmsworks.co.in) on 9/28/16.
 */
public class AsyncLoggerExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("log4j.configurationFile", "log4j2-A.xml,log4j2-B.xml,log4j2-C.xml");
        System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");

        Logger loggera = LogManager.getLogger("logger-a");
        Logger loggerb = LogManager.getLogger("logger-b");
        Logger loggerc = LogManager.getLogger("logger-c");

        Thread ta = new Thread(new AsyncLoggerExample.MyPrinter(loggera, "LoggerA: Hello World"), "LoggerA-Thread");
        Thread tb = new Thread(new AsyncLoggerExample.MyPrinter(loggerb, "LoggerB: Hello World"), "LoggerB-Thread");
        Thread tc = new Thread(new AsyncLoggerExample.MyPrinter(loggerc, "LoggerC: Hello World"), "LoggerC-Thread");

        ta.start();
        tb.start();
        tc.start();
        ta.join();
    }

    private static class MyPrinter implements Runnable {

        private Logger logger;
        private String msg;
        private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        public MyPrinter(Logger logger, String msg) {
            this.logger = logger;
            this.msg = msg;
        }

        @Override
        public void run() {
            int i=0;
            while(true) {
                try {
                    logger.info(sdf.format(new Date(System.currentTimeMillis())) + " " + msg + " " + i++);
                    Thread.sleep(1);
                } catch (Exception e) {
                    logger.error("", e);
                }
            }
        }
    }
}
