package student_sergo_kurbanov.lesson_7.level_4;

public class TriangleTest {
    public static void main(String[] args) {

        TriangleTest triangleTest = new TriangleTest();
        triangleTest.calculateAreaTest();
        triangleTest.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        double width = 7;
        double result = (Math.sqrt(width) * Math.pow(width, 2)) / 4;

        Triangle triangle = new Triangle("triangle", width);

        if (triangle.calculateArea() == result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void calculatePerimeterTest() {
        double width = 5;
        double result = width * 3;

        Triangle triangle = new Triangle("triangle", width);

        if (triangle.calculatePerimeter() == result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }


}
