package student_alexander_zhukov.lesson_16;

import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafeAtomicIdGeneratorComplexStateThreadApp {
    public static void main(String[] args) {
        AtomicInteger id = new AtomicInteger(0);
        ThreadSafeAtomicIdGeneratorComplexState startId = new ThreadSafeAtomicIdGeneratorComplexState(id);
        ThreadSafeAtomicIdGeneratorComplexStateRunnable runThread = new ThreadSafeAtomicIdGeneratorComplexStateRunnable(startId);

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
