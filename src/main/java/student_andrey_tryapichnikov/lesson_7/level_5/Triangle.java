package student_andrey_tryapichnikov.lesson_7.level_5;

public class Triangle extends Shape {
    private final int side;

    public Triangle(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    double calculateArea() {
        // getting to this formula was a surprisingly fun little exercise in math, thanks :)
        return Math.sqrt(3) * Math.pow(side, 2) / 4;
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }
}
