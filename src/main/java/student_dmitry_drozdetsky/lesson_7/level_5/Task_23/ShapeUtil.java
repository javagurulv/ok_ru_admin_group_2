package student_dmitry_drozdetsky.lesson_7.level_5.Task_23;

import java.util.Random;

public class ShapeUtil {
    private static int getRandom() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static Circle createRandomCircle(String title) {
        return new Circle(title, getRandom());
    }

    public static Square createRandomSquare(String title) {
        return new Square(title, getRandom());
    }

    public static Rectangle createRandomRectangle(String title) {
        return new Rectangle(title, getRandom(), getRandom());
    }

    public static Triangle createRandomTriangle(String title) { return new Triangle(title, getRandom()); }
}