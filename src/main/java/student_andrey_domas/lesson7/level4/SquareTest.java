package student_andrey_domas.lesson7.level4;

import org.junit.Before;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testPerimeter() {
        for (int i = 0; i < 100; i++) {
            var square = new Square(i);
            assert square.calculatePerimeter() == 4 * i;
        }
    }

    @Test
    public void testArea() {
        for (int i = 0; i < 100; i++) {
            var square = new Square(i);
            assert square.calculateArea() == i * i;
        }
    }
}
