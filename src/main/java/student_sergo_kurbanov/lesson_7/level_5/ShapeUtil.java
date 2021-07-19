package student_sergo_kurbanov.lesson_7.level_5;

import student_sergo_kurbanov.lesson_7.level_4.*;

import java.util.Random;

class ShapeUtil {
    Random r = new Random();

    Circle createRandomCircle() {
        return new Circle("circle", Math.abs(r.nextInt()));
    }

    Square createRandomSquare() {
        return new Square("square", Math.abs(r.nextInt()));
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("rectangle", Math.abs(r.nextInt()), Math.abs(r.nextInt()));
    }

    Triangle createRandomTriangle() {
        return new Triangle("triangle", Math.abs(r.nextInt()));
    }

    Shape createRandomShape() {
        switch (r.nextInt(4)) {
            case 0 -> {
                return createRandomCircle();
            }
            case 1 -> {
                return createRandomSquare();
            }
            case 2 -> {
                return createRandomRectangle();
            }
            default -> {
                return createRandomTriangle();
            }
        }
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculateArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calculateArea();
        }
        return total;
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    double calculatePerimeter(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calculatePerimeter();
        }
        return total;
    }
}
