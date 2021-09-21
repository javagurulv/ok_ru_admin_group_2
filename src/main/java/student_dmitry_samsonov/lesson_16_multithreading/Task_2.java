package student_dmitry_samsonov.lesson_16_multithreading;

public class Task_2 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5] ;
        for (int i=0; i<5; i++) {
            threads[i] = new Thread(new HelloWorld());
            threads[i].start();
        }
        try {
            for (Thread thread: threads) {
                thread.join();
            }
        } catch (InterruptedException ignored){
        }
    }
}
