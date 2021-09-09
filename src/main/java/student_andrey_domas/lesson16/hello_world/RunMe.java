package student_andrey_domas.lesson16.hello_world;

public class RunMe {

    private static final int THREADS = 5;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[THREADS];
        for (int i = 0; i < THREADS; i++) {
            int iLocalCopy = i;
            threads[i] = new Thread(() -> System.out.println(iLocalCopy + " Hello World"));
            threads[i].start();
        }

        for (var t: threads)
            t.join();
    }
}
