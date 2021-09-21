package student_dmitry_samsonov.lesson_16_multithreading;

class SafeRandomNumberListDemo {
    public static void main(String[] args) {
        int thread_count = 2;
        Thread[] threads = new Thread[thread_count];
        SafeRandomNumberList generator = new SafeRandomNumberList();
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
