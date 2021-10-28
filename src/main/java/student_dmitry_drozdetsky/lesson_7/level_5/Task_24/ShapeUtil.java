package student_dmitry_drozdetsky.lesson_7.level_5.Task_24;

import java.util.Random;

public class ShapeUtil {
    private static int getRandom() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static Circle createRandomCircle() {
        return new Circle(getRandom());
    }

    public static Square createRandomSquare() {
        return new Square(getRandom());
    }

    public static Rectangle createRandomRectangle() {
        return new Rectangle(getRandom(), getRandom());
    }

    public static Triangle createRandomTriangle() {
        return new Triangle(getRandom());
    }

    public static Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        }
        return createRandomTriangle();
    }
}