package student_sergo_kurbanov.lesson_7.level_4;

public class RectangleTest {
    public static void main(String[] args) {

        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.calculateAreaTest();
        rectangleTest.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        double width = 3;
        double height = 5;
        double result = width * height;

        Rectangle rectangle = new Rectangle("rectangle", width, height);

        if (rectangle.calculateArea() == result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void calculatePerimeterTest() {
        double width = 3;
        double height = 5;
        double result = (width + height) * 2;

        Rectangle rectangle = new Rectangle("rectangle", width, height);

        if (rectangle.calculatePerimeter() == result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
