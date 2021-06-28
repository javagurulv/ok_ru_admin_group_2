package student_andrey_domas.lesson4.level5;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LightColorDetectorTest {
    LightColorDetector detector;

    @Before
    public void init() {
        detector = new LightColorDetector();
    }

    @Test
    public void testViolet() {
        assertEquals("Violet", detector.detect(381));
    }

    @Test
    public void testBlue() {
        assertEquals("Blue", detector.detect(494));
    }

    @Test
    public void testGreen() {
        assertEquals("Green", detector.detect(500));
    }

    @Test
    public void testYellow() {
        assertEquals("Yellow", detector.detect(580));
    }

    @Test
    public void testOrange() {
        assertEquals("Orange", detector.detect(600));
    }

    @Test
    public void testRed() {
        assertEquals("Red", detector.detect(700));
    }

    @Test
    public void testInvisible() {
        assertEquals("Invisible Light", detector.detect(1000));
    }
}
