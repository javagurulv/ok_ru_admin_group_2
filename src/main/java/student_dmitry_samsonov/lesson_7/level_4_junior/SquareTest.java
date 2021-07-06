package student_dmitry_samsonov.lesson_7.level_4_junior;

class SquareTest {
    public static void main(String[] args) {
        SquareTest SquareTest = new SquareTest();
        SquareTest.calculateAreaTest();
        SquareTest.calculatePerimeterTest();
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
        Square Square = new Square(5);
        double expectedResult = 25;
        printTestResult("calculateArea", Square.calculateArea() == expectedResult);
    }
    void calculatePerimeterTest(){
        Square Square = new Square(5);
        int expectedResult = 20;
        printTestResult("calculatePerimeter", Square.calculatePerimeter() == expectedResult);

    }
}