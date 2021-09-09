package student_alexander_fateev.lesson7.level_4_5.task14_28;

import java.util.Random;

class ShapeUtil {
    Circle createRandomCircle() {
        Random rnd = new Random();
        double radius = rnd.nextInt(100);
        Circle myCircle = new Circle(radius);
        return myCircle;
    }

    Square createRandomSquare() {
        Random rnd = new Random();
        double side = rnd.nextInt(100);
        Square mySquare = new Square(side);
        return mySquare;
    }

    Rectangle createRandomRectangle() {
        Random rnd = new Random();
        double sideA = rnd.nextInt(100);
        double sideB = rnd.nextInt(100);
        Rectangle myRectangle = new Rectangle(sideA, sideB);
        return myRectangle;
    }

    Triangle createRandomTriangle() {
        Random rnd = new Random();
        double side = rnd.nextInt(100);
        Triangle myTriangle = new Triangle(side);
        return myTriangle;
    }

    Shape createRandomShape() {
        Random rnd = new Random();
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

    double calculateArea(Shape[] shapes) {
        double result = 0;
        for (Shape figure:shapes) {
            result += figure.calculateArea();
        }
        return result;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape[] shapes) {
        double result = 0;
        for (Shape figure:shapes) {
            result += figure.calculatePerimeter();
        }
        return result;
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
