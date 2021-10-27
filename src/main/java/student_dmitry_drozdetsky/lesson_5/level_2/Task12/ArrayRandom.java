package student_dmitry_drozdetsky.lesson_5.level_2.Task12;

import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int[3];

        for (int i=0; i<=2; i++) {
            numbers[i] = random.nextInt(10);
        }

        for (int i=0; i<=2; i++) {
            System.out.println("Number = " + numbers[i]);
        }
    }
}
