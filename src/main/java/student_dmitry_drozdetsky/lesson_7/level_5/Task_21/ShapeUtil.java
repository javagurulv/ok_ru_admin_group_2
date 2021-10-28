package student_dmitry_drozdetsky.lesson_7.level_5.Task_21;

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
}
