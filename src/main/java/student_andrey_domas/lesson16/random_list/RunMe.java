package student_andrey_domas.lesson16.random_list;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import java.util.Random;

@Ignore
public class RunMe {

    private Random rnd = new Random();
    private Thread[] threads = new Thread[10000];

    @Test
    public void unsafe() throws InterruptedException {
        var rnl = new RandomNumberList();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> rnl.add(rnd.nextInt()));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        Assert.assertNotEquals(threads.length, rnl.size());
    }

    @Test
    public void safe() throws InterruptedException {
        var rnl = new RandomNumberListSynchronized();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> rnl.add(rnd.nextInt()));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        Assert.assertEquals(threads.length, rnl.size());
    }
}
