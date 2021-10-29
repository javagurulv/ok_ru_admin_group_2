package student_andrey_tryapichnikov.lesson_17;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.net.URL;
// import java.util.Formatter;

public class LogDemo {
    private static Logger logger = Logger.getLogger(LogDemo.class);

    public static void main(String[] args) {
        var demo = new LogDemo();
        demo.configureLogger();

        demo.log("I am trace msg", "trace");
        demo.log("I am debug msg", "debug");
        demo.log("I am info msg", "info");
        demo.log("I am warn msg", "warn");
        demo.log("I am error msg", "error");
        demo.log("I am fatal msg", "fatal");
    }

    void configureLogger() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource("andrey_tryapichnikov_log4j.properties");
        PropertyConfigurator.configure(url);
    }

    void log(String msg, String level) {
        switch (level) {
            case "trace" -> logger.trace(msg);
            case "debug" -> logger.debug(msg);
            case "info"  -> logger.info(msg);
            case "warn"  -> logger.warn(msg);
            case "error" -> logger.error(msg);
            case "fatal" -> logger.fatal(msg);
        }
    }
}
