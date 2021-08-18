package student_artem_aleksandrov.lesson7.level4;

import junit.framework.TestCase;
import org.junit.Test;

public class SquareTest extends TestCase {

    @Test
    public void testCalculateArea() {
        Square square = new Square(10);
        assertEquals(square.calculateArea(), 100.0);
    }

    @Test
    public void testCalculatePerimeter() {
        Square square = new Square(10);
        assertEquals(square.calculatePerimeter(), 40.0);
    }
}