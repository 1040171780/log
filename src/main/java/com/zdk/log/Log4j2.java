package com.zdk.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        //Logger logger = LogManager.getLogger("mylog");
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }

//    public static void main(String[] args) {
//        Logger logger = LogManager.getLogger("mylog");
//        for(int i = 0; i < 50000; i++) {
//            logger.trace("trace level");
//            logger.debug("debug level");
//            logger.info("info level");
//            logger.warn("warn level");
//            logger.error("error level");
//            logger.fatal("fatal level");
//        }
//        try {
//            Thread.sleep(1000 * 61);
//        } catch (InterruptedException e) {}
//        logger.trace("trace level");
//        logger.debug("debug level");
//        logger.info("info level");
//        logger.warn("warn level");
//        logger.error("error level");
//        logger.fatal("fatal level");
//    }
}
