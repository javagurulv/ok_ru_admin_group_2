package student_andrey_domas.lesson4.level7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz fb;

    @Before
    public void init() {
        fb = new FizzBuzz();
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", fb.detect(15));
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", fb.detect(6));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", fb.detect(10));
    }

    @Test
    public void testString() {
        assertEquals("7", fb.detect(7));
    }
}
