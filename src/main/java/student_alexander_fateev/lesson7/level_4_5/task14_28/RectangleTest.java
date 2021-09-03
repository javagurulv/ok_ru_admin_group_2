package student_alexander_fateev.lesson7.level_4_5.task14_28;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.areaTest();
        test.perimeterTest();
    }

    void areaTest() {
        double sideA = 10;
        double sideB = 5;
        double expectedResult = 50;
        String message = "Area rectangle test";

        Rectangle myRectangle = new Rectangle(sideA, sideB);
        double result = myRectangle.calculateArea();
        printMessage(message, result, expectedResult);
    }

    void perimeterTest() {
        double sideA = 10;
        double sideB = 5;
        double expectedResult = 30;
        String message = "Perimeter rectangle test";

        Rectangle myRectangle = new Rectangle(sideA, sideB);
        double result = myRectangle.calculatePerimeter();
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
