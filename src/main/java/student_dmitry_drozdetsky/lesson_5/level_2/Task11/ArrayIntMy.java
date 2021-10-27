package student_dmitry_drozdetsky.lesson_5.level_2.Task11;

import java.util.Scanner;

public class ArrayIntMy {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<=2; i++) {
            System.out.print("Pls enter number :");
            numbers[i] = scan.nextInt();
        }

        for (int i=0; i<=2; i++) {
            System.out.println("Number = " + numbers[i]);
        }
    }
}
