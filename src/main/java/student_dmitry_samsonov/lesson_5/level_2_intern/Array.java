package student_dmitry_samsonov.lesson_5.level_2_intern;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 7;
        arr[1] = 8;
        arr[2] = 9;
        System.out.println("Task_10: " + arr[0] + ", " + arr[1] + ", " + arr[2]);

        Scanner ask = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            System.out.println("Enter number" + i + ":");
            arr[i] = ask.nextInt();
        }
        System.out.println("Task_11: " + arr[0] + ", " + arr[1] + ", " + arr[2]);

        Random rnd = new Random();
        for (int i=0; i<3; i++) {
            arr[i] = rnd.nextInt();
        }
        System.out.println("Task_12: " + arr[0] + ", " + arr[1] + ", " + arr[2]);

        long sum = arr[0] + arr[1] + arr[2];
        System.out.println("Task_13: " + sum);

        double avg = sum / 3.0;
        System.out.println("Task_14: " + avg);

        for (int i=0; i<3; i++) {
            arr[i] += 2;
        }
        System.out.println("Task_15: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
    }
}
