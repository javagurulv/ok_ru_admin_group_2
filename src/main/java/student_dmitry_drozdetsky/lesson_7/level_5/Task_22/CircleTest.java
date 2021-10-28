package student_dmitry_drozdetsky.lesson_7.level_5.Task_22;

public class CircleTest {
    public static void main(String[] args) {
        calculateAreaTest();
        calculatePerimeterTest();
    }

    static void checkTestResult(String testName, boolean testResult) {
        if (testResult) System.out.println(testName + ": OK");
        else System.out.println(testName + ": FAIL");
    }

    static void calculateAreaTest() {
        double expectedResult = 28.274333882308138;
        Circle circle = new Circle("circle", 3);
        checkTestResult("Calculate Araea",
                expectedResult == circle.calculateArea());
    }

    static void calculatePerimeterTest() {
        double expectedResult = 18.84955592153876;
        Circle circle = new Circle("circle", 3);
        checkTestResult("Carculate Perimeter",
                expectedResult == circle.calculatePerimeter());
    }
}
