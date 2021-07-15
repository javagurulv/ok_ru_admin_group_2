package student_alexey_krenev.lesson_5.level_4;

import java.util.Random;

public class Task29_Even {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[random.nextInt(100)];

        for(int i = 0; i < array.length ; i++){
            array[i] = random.nextInt();
            System.out.println(array[i]);
        }

        for (int j : array) {
            if (j % 2 == 0) {
                System.out.println("even element" + j);
            }
        }


    }

}
