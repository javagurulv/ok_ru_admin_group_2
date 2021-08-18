package student_artem_aleksandrov.lesson7.level5;

import student_artem_aleksandrov.lesson7.level4.Circle;
import student_artem_aleksandrov.lesson7.level4.Shape;
import student_artem_aleksandrov.lesson7.level4.Square;

import java.util.Random;

public class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        int radius = random.nextInt();
        return new Circle(radius);
    }

    Square createRandomSquare() {
        Random random = new Random();
        int size = random.nextInt();
        return new Square(size);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(2);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else {
            return createRandomSquare();
        }
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    double calculateArea(Shape[] shapes) {

        double areaSum = 0;

        for (Shape shape : shapes) {
            areaSum += calculateArea(shape);
        }

        return areaSum;
    }

    double calculatePerimeter(Shape[] shapes) {

        double perimeterSum = 0;

        for (Shape shape : shapes) {
            perimeterSum += calculatePerimeter(shape);
        }

        return perimeterSum;
    }
}
