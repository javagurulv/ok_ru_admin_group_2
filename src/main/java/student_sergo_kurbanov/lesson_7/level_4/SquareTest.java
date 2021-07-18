package student_sergo_kurbanov.lesson_7.level_4;

public class SquareTest {
    public static void main(String[] args) {

        SquareTest squareTest = new SquareTest();
        squareTest.calculateAreaTest();
        squareTest.calculatePerimeterTest();

    }

    public void calculateAreaTest() {
        double width = 3;
        double result = width * width;

        Square square = new Square("square", width);

        if (square.calculateArea() == result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void calculatePerimeterTest() {
        double width = 3;
        double result = (width + width) * 2;

        Square square = new Square("square", width);

        if (square.calculatePerimeter() == result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
