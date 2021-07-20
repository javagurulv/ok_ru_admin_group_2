package student_andrey_domas.lesson7.level5;

import org.junit.Before;
import org.junit.Test;
import student_andrey_domas.lesson7.level4.Shape;

public class ShapeUtilTest {

    private ShapeUtil shapeUtil;
    private Shape shapes[];
    private final int classes_cnt = 4;

    @Before
    public void setup() {
        shapeUtil = new ShapeUtil();
        shapes = new Shape[50 * classes_cnt];
        for (int i = 0; i < shapes.length; i += classes_cnt) {
            shapes[i] = shapeUtil.createRandomCircle();
            shapes[i + 1] = shapeUtil.createRandomRectangle();
            shapes[i + 2] = shapeUtil.createRandomSquare();
            shapes[i + 3] = shapeUtil.createRandomTriangle();
        }
    }

    @Test
    public void testCalculateArea() {
        double accumArea = 0;
        for (var shape: shapes) {
            accumArea += shape.calculateArea();
        }

        assert accumArea == shapeUtil.calculateArea(shapes);
    }

    @Test
    public void testCalculatePerimeter() {
        double accumPerimeter = 0;
        for (var shape: shapes) {
            accumPerimeter += shape.calculatePerimeter();
        }

        assert accumPerimeter == shapeUtil.calculatePerimeter(shapes);
    }
}
