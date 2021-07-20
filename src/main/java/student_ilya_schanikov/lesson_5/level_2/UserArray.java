package student_ilya_schanikov.lesson_5.level_2;

import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i <= 2; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please, enter number: ");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i <= 2; i++) {
            System.out.println("Element " + i + " :" + numbers[i]);
        }
    }
}
