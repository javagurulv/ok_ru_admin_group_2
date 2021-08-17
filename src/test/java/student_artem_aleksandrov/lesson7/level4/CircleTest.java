package student_artem_aleksandrov.lesson7.level4;

import junit.framework.TestCase;
import org.junit.Test;

public class CircleTest extends TestCase {

    @Test
    public void testCalculateArea() {
        Circle circle = new Circle(10);
        assertEquals(circle.calculateArea(), 314.159, 0.001);
    }

    @Test
    public void testCalculatePerimeter() {
        Circle circle = new Circle(10);
        assertEquals(circle.calculatePerimeter(), 62.83, 0.01);
    }
}