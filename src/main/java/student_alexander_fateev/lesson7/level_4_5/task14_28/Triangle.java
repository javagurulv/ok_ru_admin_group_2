package student_alexander_fateev.lesson7.level_4_5.task14_28;

class Triangle extends Shape {
    private double side;

    public Triangle(double side) {
        super("Triangle");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (side*side*Math.sqrt(3))/4;
    }

    @Override
    double calculatePerimeter() {
        return side*3;
    }
}
