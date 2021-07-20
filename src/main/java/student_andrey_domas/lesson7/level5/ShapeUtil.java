package student_andrey_domas.lesson7.level5;


import student_andrey_domas.lesson7.level4.*;

import java.util.Random;

public class ShapeUtil {

    private Random rnd;

    public ShapeUtil() {
        rnd = new Random();
    }

    Circle createRandomCircle() {
        return new Circle(rnd.nextDouble());
    }

    Square createRandomSquare() {
        return new Square(rnd.nextDouble());
    }

    Rectangle createRandomRectangle() {
        return new Rectangle(rnd.nextDouble(), rnd.nextDouble());
    }

    Triangle createRandomTriangle() {
        return new Triangle(rnd.nextDouble());
    }

    Shape createRandomShape() {
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    double calculateArea(Shape[] shapes) {
        double accumArea = 0;
        for (var shape: shapes)
            accumArea += shape.calculateArea();
        return accumArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double accumPerimeter = 0;
        for (var shape: shapes)
            accumPerimeter += shape.calculatePerimeter();
        return accumPerimeter;
    }

}
