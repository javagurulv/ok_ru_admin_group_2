package student_dmitry_samsonov.lesson_16_multithreading;

class NotThreadSafeIdGeneratorDemo {
    public static void main(String[] args) {
        Thread[] threads = new Thread[50000] ;
        NotThreadSafeIdGenerator generator = new NotThreadSafeIdGenerator(0);
        for (int i=0; i<50000; i++) {
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
