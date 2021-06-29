package student_sergo_kurbanov.lesson_4.level_2;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        if (first < second) {
            System.out.printf("\n%d", first);
        } else if (first > second) {
            System.out.printf("\n%d", second);
        } else {
            System.out.printf("\n%d and %s are equal", first, second);
        }
    }
}
