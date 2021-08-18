package student_artem_aleksandrov.lesson7.level4;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        super("Circle with radius " + radius);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2) ;
    }

    @Override
    public  double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
