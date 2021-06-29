package student_sergo_kurbanov.lesson_4.level_3;

import java.util.Scanner;

class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int First = scanner.nextInt();
        System.out.print("Enter second number: ");
        int Second = scanner.nextInt();
        System.out.print("Enter third number: ");
        int third = scanner.nextInt();

        int max = First;

        if (Second > max) {
            max = Second;
        }
        if (third > max) {
            max = third;
        }

        // TODO some or all numbers could be equal:
        //  in that case it wouldn't be correct answer
        System.out.printf("\nMax number is %d", max);
    }
}
