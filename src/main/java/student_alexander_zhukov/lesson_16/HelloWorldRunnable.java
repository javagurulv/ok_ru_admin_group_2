package student_alexander_zhukov.lesson_16;

class HelloWorldRunnable implements Runnable {

    private String str;

    public HelloWorldRunnable(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.printf("[%s] [%s]\n", Thread.currentThread().getName(), str);
    }
}
