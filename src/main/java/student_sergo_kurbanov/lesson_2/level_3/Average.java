package student_sergo_kurbanov.lesson_2.level_3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        double average = ((double) num1 + (double) num2 + (double) num3) / (double) 3;
        System.out.printf("\nThe average of %d, %d and %d is %.2f", num1, num2, num3, average);

        // Using most "wide" type - will get the same result
        double average2 = (num1 + num2 + num3) / (double) 3;
        System.out.printf("\n                                %.2f", average2);
    }
}
