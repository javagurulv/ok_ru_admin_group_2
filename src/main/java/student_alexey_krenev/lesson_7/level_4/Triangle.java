package student_alexey_krenev.lesson_7.level_4;

class Triangle extends Shape {

    private double side;

    public Triangle(double side) {
        super("Triangle");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (side*side*Math.sqrt(3))/4;

    }

    @Override
    public double calculatePerimeter() {
        return 3*side;

    }
}
