package student_dmitry_samsonov.lesson_16_multithreading;

public class Task_1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new HelloWorld());
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException ignored){
        }
    }
}
