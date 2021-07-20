package student_andrey_domas.lesson7.level4;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        super("square with side " + side);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
