package student_dmitry_samsonov.lesson_16_multithreading;

class HelloWorld implements Runnable{
    @Override
    public void run() {
        System.out.printf("[%s] Hello, World!\n", Thread.currentThread().getName());
    }
}
