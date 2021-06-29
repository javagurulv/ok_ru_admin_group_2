package student_sergo_kurbanov.lesson_4.level_1;

import java.util.Scanner;

class IfEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.printf("\n%d is even", number);
        } else {
            System.out.printf("\n%d is odd", number);
        }
    }
}
