package student_dmitry_drozdetsky.lesson_5.level_2.Task13;

import java.util.Random;

public class ArrayRandomSum {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int[3];

        for (int i=0; i<=2; i++) {
            numbers[i] = random.nextInt(10);
        }

        int sum = numbers[0] + numbers[1] + numbers[2];
        System.out.println("Summa = " + sum);
    }
}
