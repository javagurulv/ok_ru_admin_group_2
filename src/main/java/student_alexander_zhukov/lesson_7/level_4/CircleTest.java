package student_alexander_zhukov.lesson_7.level_4;

class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.testArea(2, 12.566370614359172);
        test.testPerimeter(2, 12.566370614359172);
    }

    public void testArea(double radius, double answer) {
        Circle testAreaCircle = new Circle(radius);
        checkResults(testAreaCircle.calculateArea() == answer, "testArea");
    }

    public void testPerimeter(double radius, double answer) {
        Circle testPerimeterCircle = new Circle(radius);
        checkResults(testPerimeterCircle.calculatePerimeter() == answer, "testPerimeter");
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
