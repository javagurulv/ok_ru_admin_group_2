package student_dmitry_drozdetsky.lesson_7.level_5.Task_24;

class Square extends Shape {
    private final int side;

    Square(String name, int side) {
        super(name);
        this.side = side;
    }

    Square(int side) {
        super();
        this.side = side;
    }

    @Override
    double calculateArea() {
        return this.side * this.side;
    }

    @Override
    double calculatePerimeter() {
        return this.side * 4;
    }
}
