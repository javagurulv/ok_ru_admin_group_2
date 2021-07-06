package student_dmitry_samsonov.lesson_7.level_4_junior;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest TriangleTest = new TriangleTest();
        TriangleTest.calculateAreaTest();
        TriangleTest.calculatePerimeterTest();
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
        Triangle Triangle = new Triangle(20, 20, 20);
        double expectedResult = 173.20508075688772;
        printTestResult("calculateArea", Triangle.calculateArea() == expectedResult);
    }
    void calculatePerimeterTest(){
        Triangle Triangle = new Triangle(1, 2, 3);
        int expectedResult = 6;
        printTestResult("calculatePerimeter", Triangle.calculatePerimeter() == expectedResult);

    }
}