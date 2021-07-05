package student_dmitry_samsonov.lesson_5.level_4_junior;

import java.util.Scanner;

class UserArray {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter array length:");
        int[] arr = new int[ask.nextInt()];
        for (int i=0; i<arr.length; i++) {
            System.out.println("Enter number" + i + ":");
            arr[i] = ask.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
    }
}
