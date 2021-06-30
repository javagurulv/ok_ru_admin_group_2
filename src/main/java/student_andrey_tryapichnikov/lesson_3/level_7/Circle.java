package student_andrey_tryapichnikov.lesson_3.level_7;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
