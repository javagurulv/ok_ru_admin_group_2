package student_alexander_zhukov.lesson_7.level_4;

class SquareTest {

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.testArea(2,4);
        test.testPerimeter(2,8);
    }

    public void testArea(double side, double answer) {
        Square testAreaSquare = new Square(side);
        checkResults(testAreaSquare.calculateArea() == answer, "testArea");
    }

    public void testPerimeter(double side, double answer) {
        Square testPerimeterSquare = new Square(side);
        checkResults(testPerimeterSquare.calculatePerimeter() == answer, "testPerimeter");
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
