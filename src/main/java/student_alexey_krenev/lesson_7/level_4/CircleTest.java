package student_alexey_krenev.lesson_7.level_4;


class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();

        test.calculateAreaTest();

        test.calculatePerimeterTest();

    }

    void calculateAreaTest() {
        double radius = 5;
        Circle circle = new Circle(radius);

        double expectResult = 78.53981633974483;

        double result = circle.calculateArea();
        if (result == expectResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    void calculatePerimeterTest() {
        double radius = 5;
        Circle circle = new Circle(radius);

        double expectResult = 31.41592653589793;

        double result = circle.calculatePerimeter();
        //System.out.println(result);
        if (result == expectResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }


    }
}
