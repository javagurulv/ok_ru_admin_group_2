package student_alexey_krenev.lesson_7.level_4;


class RectangleTest {

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();

        test.calculateAreaTest();

        test.calculatePerimeterTest();

    }

    void calculateAreaTest() {
        double sideA = 3.3;
        double sideB = 4.4;
        Rectangle rectangle = new Rectangle(sideA, sideB);

        double expectResult = 14.52;

        double result = rectangle.calculateArea();
        //System.out.println(result);
        if (result == expectResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    void calculatePerimeterTest() {
        double sideA = 3.3;
        double sideB = 4.4;
        Rectangle rectangle = new Rectangle(sideA, sideB);

        double expectResult = 15.4;

        double result = rectangle.calculatePerimeter();
        //System.out.println(result);
        if (result == expectResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
