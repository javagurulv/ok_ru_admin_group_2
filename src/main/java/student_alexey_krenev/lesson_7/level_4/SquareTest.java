package student_alexey_krenev.lesson_7.level_4;

class SquareTest {

    public static void main(String[] args) {
        SquareTest test = new SquareTest();

        test.calculateAreaTest();

        test.calculatePerimeterTest();

    }

    void calculateAreaTest() {
        double side = 5.2;
        Square square = new Square(side);

        double expectResult = 27.040000000000003;

        double result = square.calculateArea();
        System.out.println(result);
        if (result == expectResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    void calculatePerimeterTest() {
        double side = 5.2;
        Square square = new Square(side);

        double expectResult = 20.8;

        double result = square.calculatePerimeter();
        System.out.println(result);
        if (result == expectResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }


    }
}