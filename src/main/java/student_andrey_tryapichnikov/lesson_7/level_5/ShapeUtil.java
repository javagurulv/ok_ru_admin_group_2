package student_andrey_tryapichnikov.lesson_7.level_5;

import java.util.Random;

public class ShapeUtil {
    final Random random = new Random();

    Circle createRandomCircle(int limit) {
        return new Circle(random.nextInt(limit));
    }

    Circle createRandomCircle() {
        return createRandomCircle(100);
    }

    Square createRandomSquare(int limit) {
        return new Square(random.nextInt(limit));
    }

    Square createRandomSquare() {
        return createRandomSquare(100);
    }

    Rectangle createRandomRectangle(int limit) {
        var sideA = random.nextInt(limit);
        var sideB = random.nextInt(limit);
        return new Rectangle(sideA, sideB);
    }

    Rectangle createRandomRectangle() {
        return createRandomRectangle(100);
    }

    Triangle createRandomTriangle(int limit) {
        return new Triangle(random.nextInt(limit));
    }

    Triangle createRandomTriangle() {
        return createRandomTriangle(100);
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
        double areaSum = 0d;
        for (Shape shape: shapes) {
            areaSum += shape.getArea();
        }
        return areaSum;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeterSum = 0d;
        for (Shape shape: shapes) {
            perimeterSum += shape.getPerimeter();
        }
        return perimeterSum;
    }
}
