package student_dmitry_samsonov.lesson_5.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class UserRandArray {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter array length:");
        int[] arr = new int[ask.nextInt()];
        Random rnd = new Random();
        for (int i=0; i<arr.length; i++) {
            arr[i] = rnd.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
    }
}
