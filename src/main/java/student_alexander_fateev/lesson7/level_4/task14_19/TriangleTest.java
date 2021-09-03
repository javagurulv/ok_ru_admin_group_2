package student_alexander_fateev.lesson7.level_4.task14_19;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.areaTest();
        test.perimeterTest();

    }

    void areaTest() {
        double side = 10;
        double expectedResult = 43.30127018922193;
        String message = "Area triangle test";

        Triangle myTriangle = new Triangle(side);
        double result = myTriangle.calculateArea();
        printMessage(message, result, expectedResult);
    }

    void perimeterTest() {
        double side = 10;
        double expectedResult = 30;
        String message = "Perimeter triangle test";

        Triangle myTriangle = new Triangle(side);
        double result = myTriangle.calculatePerimeter();
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
