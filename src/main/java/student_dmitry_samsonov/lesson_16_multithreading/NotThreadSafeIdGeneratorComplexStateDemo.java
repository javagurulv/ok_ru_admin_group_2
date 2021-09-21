package student_dmitry_samsonov.lesson_16_multithreading;

public class NotThreadSafeIdGeneratorComplexStateDemo {
    public static void main(String[] args) {
        int thread_count = 1000000;
        Thread[] threads = new Thread[thread_count];
        NotThreadSafeIdGeneratorComplexState generator = new NotThreadSafeIdGeneratorComplexState();
        for (int i=0; i<thread_count; i++) {
            threads[i] = new Thread(generator);
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
