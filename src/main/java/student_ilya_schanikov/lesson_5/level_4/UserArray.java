package student_ilya_schanikov.lesson_5.level_4;

import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        System.out.println("Please, enter array size : ");
        Scanner tmp = new Scanner(System.in);
        int length = tmp.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please, enter number: ");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
    }
}
