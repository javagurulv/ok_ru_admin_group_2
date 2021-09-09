package student_alexander_fateev.lesson7.level_4_5.task14_28;

class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side*side;
    }

    @Override
    double calculatePerimeter() {
        return side*4;
    }
}
