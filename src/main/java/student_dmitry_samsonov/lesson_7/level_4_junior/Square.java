package student_dmitry_samsonov.lesson_7.level_4_junior;

class Square extends Shape{
    private int side;

    Square(int side) {
        super("Square");
        this.side = side;
    }
    @Override
    double calculateArea() {
        return this.side * this.side;
    }
    @Override
    int calculatePerimeter() {
        return this.side * 4;
    }
}
