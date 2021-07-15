package student_alexey_krenev.lesson_5.level_2;

import java.util.Random;


public class Task_15_IncreaseArray {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);

        }

        for (int i = 0; i < 3; i++) {
            array[i]++;
            System.out.println(array[i]);

        }
    }
}
