package in.co.nmsworks.log4j2.examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by kamal (kamal@nmsworks.co.in) on 10/13/16.
 * <p>
 * Copyright 2016-2017 NMSWorks Software Pvt Ltd. All rights reserved.
 * NMSWorks PROPRIETARY/CONFIDENTIAL. Use is subject to licence terms.
 */
public class AppenderRefExample {

    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "log4j2-A.xml,log4j2-B.xml,log4j2-C.xml");
        Logger loggerd = LogManager.getLogger("logger-d");
        loggerd.trace("I'm trace");
        loggerd.debug("I'm debug");
        loggerd.info("I'm info");
        loggerd.warn("I'm warn");
        loggerd.error("I'm error");
        loggerd.fatal("I'm fatal");
    }
}
