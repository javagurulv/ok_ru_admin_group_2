package student_dmitry_drozdetsky.lesson_7.level_5.Task_24;

public class SquareTest {
    public static void main(String[] args) {
        calculateAreaTest();
        calculatePerimeterTest();
    }

    static void checkTestResult(String testName, boolean testResult) {
        if (testResult) System.out.println(testName + ": OK");
        else System.out.println(testName + ": FAIL");
    }

    static void calculateAreaTest() {
        int expectedResult = 4;
        Square square = new Square("square", 2);
        checkTestResult("Calculate Araea",
                expectedResult == square.calculateArea());
    }

    static void calculatePerimeterTest() {
        double expectedResult = 8;
        Square square = new Square("circle", 2);
        checkTestResult("Carculate Perimeter",
                expectedResult == square.calculatePerimeter());
    }
}
