package student_dmitry_drozdetsky.lesson_7.level_5.Task_23;

class Rectangle extends Shape {
    private final int sideA;
    private final int sideB;

    Rectangle(String name, int sideA, int sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return this.sideA * this.sideB;
    }

    @Override
    double calculatePerimeter() {
        return this.sideA * 2 + this.sideB * 2;
    }
}
