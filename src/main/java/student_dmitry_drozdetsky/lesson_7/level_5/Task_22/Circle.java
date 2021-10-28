package student_dmitry_drozdetsky.lesson_7.level_5.Task_22;

class Circle extends Shape {
    private final double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getRadius() {
        return radius;
    }
}
