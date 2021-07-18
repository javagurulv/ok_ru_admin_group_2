package student_dmitry_samsonov.lesson_7.level_4_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RectangleTest {
    public static void main(String[] args) {
        RectangleTest RectangleTest = new RectangleTest();
        RectangleTest.calculateAreaTest();
        RectangleTest.calculatePerimeterTest();
    }
    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }
    void calculateAreaTest(){
        Rectangle Rectangle = new Rectangle(5, 6);
        double expectedResult = 30;
        printTestResult("calculateArea", Rectangle.calculateArea() == expectedResult);
    }
    void calculatePerimeterTest(){
        Rectangle Rectangle = new Rectangle(5, 6);
        int expectedResult = 22;
        printTestResult("calculatePerimeter", Rectangle.calculatePerimeter() == expectedResult);

    }
}