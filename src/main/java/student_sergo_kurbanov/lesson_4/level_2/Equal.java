package student_sergo_kurbanov.lesson_4.level_2;

import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int First = scanner.nextInt();

        System.out.print("Enter second number: ");
        int Second = scanner.nextInt();

        if (First == Second) {
            System.out.printf("\n%d and %s are equals", First, Second);
        } else {
            System.out.printf("\n%d and %s are different", First, Second);
        }
    }
}
