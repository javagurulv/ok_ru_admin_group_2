package student_sergo_kurbanov.lesson_7.level_4;

public class CircleTest {
    public static void main(String[] args) {

        CircleTest circleTest = new CircleTest();
        circleTest.calculateAreaTest();
        circleTest.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        double radius = 3;
        double result = Math.PI * radius * radius;

        Circle circle = new Circle("circle", radius);

        if (circle.calculateArea() == result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void calculatePerimeterTest() {
        double radius = 3;
        double result = 2 * Math.PI * radius;

        Circle circle = new Circle("circle", radius);

        if (circle.calculatePerimeter() == result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
