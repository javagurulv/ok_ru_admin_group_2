package student_sergo_kurbanov.lesson_7.level_4;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String title, double width, double height) {
        super(title);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height) * 2;
    }
}
