/** CompositeConfigurationExample.java -
* @version      $Name$
* @module       in.co.nmsworks.log4j2.examples
* 
* @purpose
* @see
*
* @author   Kamal (kamal@nmsworks.co.in)
*
* @created  Jul 15, 2016
* $Id$
*
* @bugs
*
* Copyright 2016-2017 NMSWorks Software Pvt Ltd. All rights reserved.
* NMSWorks PROPRIETARY/CONFIDENTIAL. Use is subject to licence terms.
*/ 

package in.co.nmsworks.log4j2.examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompositeConfigurationExample {

	public CompositeConfigurationExample() {
	}

	public static void main(String[] args) {
		
		System.setProperty("log4j.configurationFile", "log4j2-A.xml,log4j2-B.xml,log4j2-C.xml");
		
		Logger loggera = LogManager.getLogger("logger-a");
		Logger loggerb = LogManager.getLogger("logger-b");
		Logger loggerc = LogManager.getLogger("logger-c");
		
		loggera.info("LoggerA: Hello World");
		loggerb.info("LoggerB: Hello World");
		loggerc.info("LoggerC: Hello World");
	}
}


/**
 * $Log$
 *  
 */
