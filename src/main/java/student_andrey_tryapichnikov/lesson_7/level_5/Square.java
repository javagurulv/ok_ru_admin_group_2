package student_andrey_tryapichnikov.lesson_7.level_5;

public class Square extends Shape {
    private int side;

    Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }
}
