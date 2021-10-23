package student_alexander_zhukov.lesson_16;

class RandomNumberListThreadApp {

    public static void main(String[] args) {
        RandomNumberList rList = new RandomNumberList();
        RandomNumberListRunnable rRun = new RandomNumberListRunnable(rList);

        Thread[] threads = new Thread[10] ;
        for (int i=0; i < threads.length; i++) {
            threads[i] = new Thread(rRun);
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
