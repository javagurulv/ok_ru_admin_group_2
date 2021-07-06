package student_dmitry_samsonov.lesson_7.level_5_middle;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    int calculatePerimeter() {
        return (int) (Math.PI * this.radius * 2);
    }
}