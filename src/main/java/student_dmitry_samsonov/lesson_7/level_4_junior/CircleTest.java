package student_dmitry_samsonov.lesson_7.level_4_junior;

class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.calculateAreaTest();
        circleTest.calculatePerimeterTest();
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
        Circle circle = new Circle(5);
        double expectedResult = 78.53981633974483;
        printTestResult("calculateArea", circle.calculateArea() == expectedResult);
    }
    void calculatePerimeterTest(){
        Circle circle = new Circle(5);
        int expectedResult = 31;
        printTestResult("calculatePerimeter", circle.calculatePerimeter() == expectedResult);

    }
}
