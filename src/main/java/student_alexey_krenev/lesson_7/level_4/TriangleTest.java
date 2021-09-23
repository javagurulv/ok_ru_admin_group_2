package student_alexey_krenev.lesson_7.level_4;


class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();

        test.calculateAreaTest();

        test.calculatePerimeterTest();

    }

    void calculateAreaTest() {
        double side = 5.5;
        Triangle triangle = new Triangle(side);

        double expectResult = 13.098634232239634;

        double result = triangle.calculateArea();
        System.out.println(result);
        if (result == expectResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    void calculatePerimeterTest() {
        double side = 5.5;
        Triangle triangle = new Triangle(side);

        double expectResult = 16.5;

        double result = triangle.calculatePerimeter();
        System.out.println(result);
        if (result == expectResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }


    }
}