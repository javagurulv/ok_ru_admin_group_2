package student_sergo_kurbanov.lesson_7.level_4;

public class Triangle extends Shape {
    double width;

    public Triangle(String title, double width) {
        super(title);
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(width) * Math.pow(width, 2)) / 4;
    }

    @Override
    public double calculatePerimeter() {
        return width * 3;
    }
}
