package student_artem_aleksandrov.lesson7.level5;

import junit.framework.TestCase;
import org.junit.Test;
import student_artem_aleksandrov.lesson7.level4.Circle;
import student_artem_aleksandrov.lesson7.level4.Shape;
import student_artem_aleksandrov.lesson7.level4.Square;

public class ShapeUtilTest extends TestCase {

    @Test
    public void testCalculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        System.out.println(shapeUtil.calculateArea(shapes));
        assertEquals(shapeUtil.calculateArea(shapes), 66.26, 0.01);
    }

    @Test
    public void testCalculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        assertEquals(shapeUtil.calculatePerimeter(shapes), 41.13, 0.01);
    }
}