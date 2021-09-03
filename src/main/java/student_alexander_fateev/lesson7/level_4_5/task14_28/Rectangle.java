package student_alexander_fateev.lesson7.level_4_5.task14_28;

class Rectangle extends Shape {
    private double sideA, sideB;

    public Rectangle(double sideA, double sideB) {
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return sideA*sideB;
    }

    @Override
    double calculatePerimeter() {
        return (sideA*2) + (sideB*2);
    }
}
