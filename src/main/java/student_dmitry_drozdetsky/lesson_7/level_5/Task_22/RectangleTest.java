package student_dmitry_drozdetsky.lesson_7.level_5.Task_22;

public class RectangleTest {
    public static void main(String[] args) {
        calculateAreaTest();
        calculatePerimeterTest();
    }

    static void checkTestResult(String testName, boolean testResult) {
        if (testResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    static void calculateAreaTest() {
        int expectedResult = 8;
        Rectangle shape = new Rectangle("square", 2, 4);
        checkTestResult("Calculate Araea",
                expectedResult == shape.calculateArea());
    }

    static void calculatePerimeterTest() {
        double expectedResult = 12;
        Rectangle shape = new Rectangle("circle", 2, 4);
        checkTestResult("Carculate Perimeter",
                expectedResult == shape.calculatePerimeter());
    }
}
