package student_artem_aleksandrov.lesson7.level4;

public class Square extends Shape {

    private float sideSize;

    public Square(float sideSize) {
        super("Square with side: %s".formatted(sideSize));
        this.sideSize = sideSize;

    }
    @Override
    public double calculateArea() {
        return Math.pow(sideSize, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideSize;
    }
}
