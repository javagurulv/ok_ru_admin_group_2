package student_dmitry_drozdetsky.lesson_5.level_2.Task14;

import java.util.Random;

public class ArrayRandomAvg {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int[3];

        for (int i=0; i<=2; i++) {
            numbers[i] = random.nextInt(10);
        }

        double avg = ((double) numbers[0] + (double) numbers[1] + (double) numbers[2] / 3);
        System.out.println("Average count = " + avg);
    }
}
