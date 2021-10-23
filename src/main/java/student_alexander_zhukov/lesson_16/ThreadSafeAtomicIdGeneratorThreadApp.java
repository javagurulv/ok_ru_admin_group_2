package student_alexander_zhukov.lesson_16;

import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafeAtomicIdGeneratorThreadApp {
    public static void main(String[] args) {
        AtomicInteger id = new AtomicInteger(0);
        ThreadSafeAtomicIdGenerator startId = new ThreadSafeAtomicIdGenerator(id);
        ThreadSafeAtomicIdGeneratorRunnable runThread = new ThreadSafeAtomicIdGeneratorRunnable(startId);

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

        System.out.println(startId.nextId());

    }
}
