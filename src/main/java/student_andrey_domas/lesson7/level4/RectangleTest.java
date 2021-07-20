package student_andrey_domas.lesson7.level4;

import org.junit.Test;

public class RectangleTest {

    @Test
    public void testArea() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                var rectangle = new Rectangle(i, j);
                assert rectangle.calculateArea() == i * j;
            }
        }
    }

    @Test
    public void testPerimiter() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                var rectangle = new Rectangle(i, j);
                assert rectangle.calculatePerimeter() == 2 * (i + j);
            }
        }
    }
}
