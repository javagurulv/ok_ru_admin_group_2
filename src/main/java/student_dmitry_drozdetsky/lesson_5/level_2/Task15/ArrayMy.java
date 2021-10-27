package student_dmitry_drozdetsky.lesson_5.level_2.Task15;

import java.util.Random;

public class ArrayMy {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int[3];

        for (int i=0; i<=2; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println("Random number:  " + numbers[i]);
        }

        for (int i=0; i<=2; i++) {
            numbers[i] = numbers[i] + 2;
            System.out.println("Random number increase by 2" + i + " = " + numbers[i]);
        }
    }
}
