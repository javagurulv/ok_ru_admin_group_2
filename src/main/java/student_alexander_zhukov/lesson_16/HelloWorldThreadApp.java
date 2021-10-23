package student_alexander_zhukov.lesson_16;

class HelloWorldThreadApp {
    public static void main(String[] args) {
        String str = "Hello World";
        Thread thread1 = new Thread(new HelloWorldRunnable(str));
        Thread thread2 = new Thread(new HelloWorldRunnable(str));
        Thread thread3 = new Thread(new HelloWorldRunnable(str));
        Thread thread4 = new Thread(new HelloWorldRunnable(str));
        Thread thread5 = new Thread(new HelloWorldRunnable(str));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
