package student_andrey_domas.lesson7.level4;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void testPerimeter() {
        for (int i = 0; i < 100; i++) {
            var triangle = new Triangle(i);
            assert triangle.calculatePerimeter() == 3 * i;
        }
    }

    @Test
    public void testArea() {
        for (int i = 0; i < 100; i++) {
            var triangle = new Triangle(i);
            assert triangle.calculateArea() == Math.sqrt(3) / 4 * Math.pow(i, 2);
        }
    }

    @Test
    public void testAreaPerimeter() {
        for (int i = 1; i < 100; i++) {
            var triangle = new Triangle(i);
            var perimeter = triangle.calculatePerimeter();
            var area = triangle.calculateArea();
            var areaFromPerimeter = Math.sqrt(3) / 36 * Math.pow(perimeter, 2);
            assert Math.round(area * 1000d) == Math.round(areaFromPerimeter * 1000d);
        }
    }

}
