package student_dmitry_samsonov.lesson_7.level_4_junior;

class Rectangle extends Shape{
    private int side1;
    private int side2;

    Rectangle(int side1, int side2) {
        super("Rectangle");
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    double calculateArea() {
        return this.side1 * this.side2;
    }
    @Override
    int calculatePerimeter() {
        return this.side1 * 2 + this.side2 * 2;
    }
}
