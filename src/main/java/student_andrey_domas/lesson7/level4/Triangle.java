package student_andrey_domas.lesson7.level4;

public class Triangle extends Shape {

    private double side;

    public Triangle(double side) {
        super("equilateral rectangle, side = " + side);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(3) / 4 * Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 3 * side;
    }
}
