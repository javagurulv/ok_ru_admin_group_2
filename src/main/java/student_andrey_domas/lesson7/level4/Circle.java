package student_andrey_domas.lesson7.level4;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("circle with radius " + radius);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
