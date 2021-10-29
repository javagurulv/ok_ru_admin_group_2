package student_andrey_tryapichnikov.lesson_16;

public class NotThreadSafeIdGeneratorProof {

    public static void main(String[] args) {
        var threadCount = 5;
        var idCount = 1000000;

        var generator = new NotThreadSafeIdGenerator();
        var threads = new Thread[threadCount];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(
                    () -> {
                        for (int a = 0; a < idCount; a++) {
                            generator.nextId();
                        }
                    }
            );
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.exit(1);
            }
        }
        System.out.printf("%s threads counted %s (should be %s)\n", threadCount, generator.getId(), idCount * threadCount);
    }
}
