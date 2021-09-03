package student_alexander_fateev.lesson7.level_4_5.task14_28;

class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();

        test.areaTest();
        test.perimeterTest();

    }

    void areaTest() {
        double radius = 10;
        double expectedResult = 314.1592653589793;
        String message = "Area circle test";

        Circle myCircle = new Circle(radius);
        double result = myCircle.calculateArea();
        printMessage(message, result, expectedResult);
    }

    void perimeterTest() {
        double radius = 10;
        double expectedResult = 62.83185307179586;
        String message = "Perimeter circle test";

        Circle myCircle = new Circle(radius);
        double result = myCircle.calculatePerimeter();
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
