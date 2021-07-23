package student_alexander_zhukov.lesson_7.level_4;

class RectangleTest {

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.testArea(3,4,12);
        test.testPerimeter(3,4,14);
    }

    public void testArea(double sideA, double sideB, double answer) {
        Rectangle testAreaRectangle = new Rectangle(sideA, sideB);
        checkResults(testAreaRectangle.calculateArea() == answer, "testArea");
    }

    public void testPerimeter(double sideA, double sideB, double answer) {
        Rectangle testPerimeterRectangle = new Rectangle(sideA, sideB);
        checkResults(testPerimeterRectangle.calculatePerimeter() == answer, "testPerimeter");
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
