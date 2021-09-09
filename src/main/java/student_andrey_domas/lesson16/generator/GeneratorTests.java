package student_andrey_domas.lesson16.generator;

import org.junit.Test;

public abstract class GeneratorTests {

    protected Generator generator;

    public void singleThread(int iterations) {
        int i;
        for (i = 0; i < iterations; i++)
            generator.nextId();
    }

    public void multiThread(int threads, int iterations) throws InterruptedException {
        Thread[] ths = new Thread[threads];
        for(int i = 0; i< threads; i++) {
            Generator finalGenerator = generator;
            ths[i] = new Thread(() -> {
                for (int j = 0; j < iterations; j++)
                    generator.nextId();
            });
            ths[i].start();
        }
        for (var thread: ths)
            thread.join();
    }

    @Test
    public void evenSout() throws InterruptedException {
        Thread[] ths = new Thread[4];
        for(int i = 0; i< 4; i++) {
            Generator finalGenerator = generator;
            ths[i] = new Thread(() -> {
                for (int j = 0; j < 1000000; j++) {
                    int number = generator.nextId();
                    if (number % 2 == 0 && !generator.isEven())
                        System.out.println(number + ", isEven() == " + generator.isEven());
                    else if (number % 2 != 0 && generator.isEven())
                        System.out.println(number + ", isEven() == " + generator.isEven());
                }
            });
            ths[i].start();
        }
        for (var thread: ths)
            thread.join();
    }
}
