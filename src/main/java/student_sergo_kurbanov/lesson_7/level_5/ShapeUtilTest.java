package student_sergo_kurbanov.lesson_7.level_5;

import student_sergo_kurbanov.lesson_7.level_4.*;

public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("circle", 4);
        shapes[1] = new Square("square", 4);
        shapes[2] = new Rectangle("rectangle", 4, 4);
        shapes[3] = new Triangle("triangle", 4);

        calculateAreaTest(shapes);
        calculatePerimeterTest(shapes);
    }

    public static void calculateAreaTest(Shape[] shapes) {
        // area methode have already tested so we could rely on it
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.calculateArea();
        }
        ShapeUtil shapeUtil = new ShapeUtil();
        if (shapeUtil.calculateArea(shapes) == result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void calculatePerimeterTest(Shape[] shapes) {
        // perimeter methode have already tested so we could rely on it
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.calculatePerimeter();
        }

        ShapeUtil shapeUtil = new ShapeUtil();
        if (shapeUtil.calculatePerimeter(shapes) == result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
