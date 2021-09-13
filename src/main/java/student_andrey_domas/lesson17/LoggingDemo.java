package student_andrey_domas.lesson17;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;
import java.net.URL;

public class LoggingDemo {

    private static void logMessages(Logger logger) {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
    }

    public static void main(String[] args) throws IOException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource("andrey_domas_log4j.properties");
        PropertyConfigurator.configure(url);

        var loggerLevel3 = Logger.getLogger("level1.level2.level3");
        logMessages(loggerLevel3);

        var loggerLevel2 = Logger.getLogger("level1.level2");
        logMessages(loggerLevel2);

        var loggerLevel1 = Logger.getLogger("level1");
        logMessages(loggerLevel1);
    }
}
