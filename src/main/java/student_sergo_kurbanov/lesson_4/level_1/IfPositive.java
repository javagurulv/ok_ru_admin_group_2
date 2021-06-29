package student_sergo_kurbanov.lesson_4.level_1;

import java.util.Scanner;

public class IfPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int number: ");
        int Number = scanner.nextInt();

        if (Number < 0) {
            System.out.printf("\n%d is negative", Number);
        } else if (Number > 0) {
            System.out.printf("\n%d is positive", Number);
        } else {
            System.out.printf("\n%d is zero", Number);
        }
    }
}
