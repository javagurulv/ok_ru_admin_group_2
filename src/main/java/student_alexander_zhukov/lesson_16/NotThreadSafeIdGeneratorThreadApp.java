package student_alexander_zhukov.lesson_16;

class NotThreadSafeIdGeneratorThreadApp {
    public static void main(String[] args) {
        int id = 0;
        NotThreadSafeIdGenerator startId = new NotThreadSafeIdGenerator(id);
        NotThreadSafeIdGeneratorRunnable runThread = new NotThreadSafeIdGeneratorRunnable(startId);

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
