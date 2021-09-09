package student_andrey_tryapichnikov.lesson_7.level_5;

public class Rectangle extends Shape {
    private final int sideA;
    private final int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }

    @Override
    double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }
}