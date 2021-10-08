package student_alexander_fateev.lesson11.level_1.task5;

class ExceptionDemo extends Exception {

    public ExceptionDemo() {
    }

    public ExceptionDemo(String message) {
        super(message);
    }

    public ExceptionDemo(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionDemo(Throwable cause) {
        super(cause);
    }

    public ExceptionDemo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
