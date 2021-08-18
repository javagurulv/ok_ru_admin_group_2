package student_alexander_zhukov.lesson_7.level_5;

import java.util.Arrays;
import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        double radius = random.nextInt(10) + 1;
        Circle randomCircle = new Circle(radius);
        return randomCircle;
    }

    Square createRandomSquare() {
        Random random = new Random();
        double side = random.nextInt(10) + 1;
        Square randomSquare = new Square(side);
        return randomSquare;
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        double sideA = random.nextInt(10) + 1;
        double sideB = random.nextInt(10) + 1;
        Rectangle randomRectangle = new Rectangle(sideA, sideB);
        return randomRectangle;
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        double sideA = random.nextInt(10) + 1;
        Triangle randomTriangle = new Triangle(sideA, sideA, sideA);
        return randomTriangle;
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
        double area = 0;
        for (Shape figure: shapes) {
            area += figure.calculateArea();
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (Shape figure: shapes) {
            perimeter += figure.calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
