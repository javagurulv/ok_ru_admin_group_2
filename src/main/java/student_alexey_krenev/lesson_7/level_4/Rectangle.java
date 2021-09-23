package student_alexey_krenev.lesson_7.level_4;

class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        super("Rectangle");

        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;

    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideA + sideB);

    }
}
