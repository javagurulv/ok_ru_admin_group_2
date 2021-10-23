package student_alexander_zhukov.lesson_16;

public class NotThreadSafeIdGeneratorComplexStateThreadApp {
    public static void main(String[] args) {
        int id = 0;
        NotThreadSafeIdGeneratorComplexState startId = new NotThreadSafeIdGeneratorComplexState(id);
        NotThreadSafeIdGeneratorComplexStateRunnable runThread = new NotThreadSafeIdGeneratorComplexStateRunnable(startId);

        Thread[] threads = new Thread[1000] ;
        for (int i=0; i < threads.length; i++) {
            threads[i] = new Thread(runThread);
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
