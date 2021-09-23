package student_alexey_krenev.lesson_7.level_4;

class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");

        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;

    }

    @Override
    public double calculatePerimeter() {
        return side*4;

    }
}
