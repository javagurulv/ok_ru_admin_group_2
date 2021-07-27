package student_alexander_zhukov.lesson_7.level_4;

class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.testArea(3,4,5,6);
        test.testPerimeter(3,4,5, 12);
    }

    public void testArea(double sideA, double sideB, double sideC, double answer) {
        Triangle testAreaTriangle = new Triangle(sideA, sideB, sideC);
        checkResults(testAreaTriangle.calculateArea() == answer, "testArea");
    }

    public void testPerimeter(double sideA, double sideB, double sideC, double answer) {
        Triangle testPerimeterTriangle = new Triangle(sideA, sideB, sideC);
        checkResults(testPerimeterTriangle.calculatePerimeter() == answer, "testPerimeter");
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
