package student_dmitry_samsonov.lesson_7.level_5_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateAreaTest();
        shapeUtilTest.calculatePerimeterTest();
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
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(4);
        shapes[1] = new Rectangle(2, 2);
        double expectedResult = 20;
        printTestResult("calculateAreaTest", shapeUtil.calculateArea(shapes) == expectedResult);
    }
    void calculatePerimeterTest(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(4);
        shapes[1] = new Rectangle(2, 2);
        double expectedResult = 24;
        printTestResult("calculatePerimeterTest", shapeUtil.calculatePerimeter(shapes) == expectedResult);
    }
}
