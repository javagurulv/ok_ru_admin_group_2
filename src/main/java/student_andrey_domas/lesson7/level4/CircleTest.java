package student_andrey_domas.lesson7.level4;

import org.junit.Test;

public class CircleTest {

    @Test
    public void testArea() {
        for (int i = 1; i<100; i++) {
            var circle = new Circle(i);
            assert circle.calculateArea() == Math.PI * Math.pow(i, 2);
        }
    }

    @Test
    public void testPerimeter() {
        for (int i = 1; i<100; i++) {
            var circle = new Circle(i);
            assert circle.calculatePerimeter() == 2 * Math.PI * i;
        }
    }

}
