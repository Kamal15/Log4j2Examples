package in.co.nmsworks.log4j2.examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

/**
 * Created by kamal (kamal@nmsworks.co.in) on 10/13/16.
 * <p>
 * Copyright 2016-2017 NMSWorks Software Pvt Ltd. All rights reserved.
 * NMSWorks PROPRIETARY/CONFIDENTIAL. Use is subject to licence terms.
 */
public class AppenderRefExample {

    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "log4j2-A.xml,log4j2-B.xml,log4j2-C.xml");
        Marker marker = MarkerManager.getMarker("Hello");
        Logger loggerd = LogManager.getLogger("logger-d");
        loggerd.trace(marker, "I'm trace");
        loggerd.debug(marker, "I'm debug");
        loggerd.info(marker, "I'm info");
        loggerd.warn(marker, "I'm warn");
        loggerd.error(marker, "I'm error");
        loggerd.fatal(marker, "I'm fatal");
    }
}
