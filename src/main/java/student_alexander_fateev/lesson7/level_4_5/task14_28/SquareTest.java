package student_alexander_fateev.lesson7.level_4_5.task14_28;

class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.areaTest();
        test.perimeterTest();
    }

    void areaTest() {
        double side = 10;
        double expectedResult = 100;
        String message = "Area square test";

        Square mySquare = new Square(side);
        double result = mySquare.calculateArea();
        printMessage(message, result, expectedResult);
    }

    void perimeterTest() {
        double side = 10;
        double expectedResult = 40;
        String message = "Perimeter square test";

        Square mySquare = new Square(side);
        double result = mySquare.calculatePerimeter();
        printMessage(message, result, expectedResult);
    }

    void printMessage(String message, double result, double expectedResult) {
        if (result == expectedResult) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }
}
