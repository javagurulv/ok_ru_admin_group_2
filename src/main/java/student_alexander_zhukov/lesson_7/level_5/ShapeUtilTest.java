package student_alexander_zhukov.lesson_7.level_5;

class ShapeUtilTest {
    public static void main(String[] args) {

        int side = 4;
        ShapeUtilTest test = new ShapeUtilTest();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(side);
        shapes[1] = new Square(side);
        shapes[2] = new Rectangle(side, side);
        shapes[3] = new Triangle(side, side, side);

        test.calculateAreaTest(shapes,89.1936856877122);
        test.calculatePerimeterTest(shapes, 69.13274122871834);

    }

    public void calculateAreaTest(Shape[] shapes, double answer) {
        ShapeUtil shapeUtil = new ShapeUtil();
        checkResults(shapeUtil.calculateArea(shapes) == answer, "calculateAreaTest");

    }

    public void calculatePerimeterTest(Shape[] shapes, double answer) {
        ShapeUtil shapeUtil = new ShapeUtil();
        checkResults(shapeUtil.calculatePerimeter(shapes) == answer, "calculatePerimeterTest");

    }

    public void checkResults(boolean result, String name) {
        if (result) {
            System.out.println("Test " + name + " - OK");
        }
        else {
            System.out.println("Test " + name + " - FAIL");
        }
    }
}
