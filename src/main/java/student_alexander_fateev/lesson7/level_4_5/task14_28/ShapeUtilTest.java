package student_alexander_fateev.lesson7.level_4_5.task14_28;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.sumAreaTest();
        test.sumPerimeterTest();

    }

    void sumAreaTest() {
        double expectedResult = 89.1936856877122;

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 4);
        shapes[3] = new Triangle(4);

        double result = shapeUtil.calculateArea(shapes);
        if (result == expectedResult) {
            System.out.println("Sum area test: OK");
        }
        else {
            System.out.println("Sum area test: FAIL");
        }
    }

    void sumPerimeterTest() {
        double expectedResult = 69.13274122871834;

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 4);
        shapes[3] = new Triangle(4);

        double result = shapeUtil.calculatePerimeter(shapes);
        if (result == expectedResult) {
            System.out.println("Sum perimeter test: OK");
        }
        else {
            System.out.println("Sum perimeter test: FAIL");
        }
    }
}
