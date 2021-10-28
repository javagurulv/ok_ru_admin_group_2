package student_dmitry_drozdetsky.lesson_7.level_5.Task_24;

public class TriangleTest {
    public static void main(String[] args) {
        calculateAreaTest();
        calculatePerimeterTest();
    }

    static void checkTestResult(String testName, boolean testResult) {
        if (testResult) System.out.println(testName + ": OK");
        else System.out.println(testName + ": FAIL");
    }

    static void calculateAreaTest() {
        double expectedResult = 43.30127018922193;
        Triangle shape = new Triangle("square", 10);
        checkTestResult("Calculate Araea",
                expectedResult == shape.calculateArea());
    }

    static void calculatePerimeterTest() {
        double expectedResult = 30;
        Triangle shape = new Triangle("circle", 10);
        checkTestResult("Carculate Perimeter",
                expectedResult == shape.calculatePerimeter());
    }
}
