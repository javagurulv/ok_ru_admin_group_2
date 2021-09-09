package student_andrey_domas.lesson16.generator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NotThreadSafeTest extends GeneratorTests {

    @Before
    public void setup() {
        generator = new NotThreadSafeIdGenerator();
    }

    @Test
    public void singleThread() {
        super.singleThread(1000000);
        Assert.assertEquals(1000000 + 1, generator.nextId());
    }

    @Test
    public void multiThread() throws InterruptedException {
        super.multiThread(4, 1000000);
        Assert.assertNotEquals(4 * 1000000 + 1, generator.nextId());
    }
}
