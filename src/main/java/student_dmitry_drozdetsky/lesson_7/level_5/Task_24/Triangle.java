package student_dmitry_drozdetsky.lesson_7.level_5.Task_24;

public class Triangle extends Shape {
    private final int side;

    Triangle(String name, int side) {
        super(name);
        this.side = side;
    }

    public Triangle(int side) {
        super();
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (this.side * this.side * Math.sqrt(3)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return this.side * 3;
    }
}