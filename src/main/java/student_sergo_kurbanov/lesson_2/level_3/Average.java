package student_sergo_kurbanov.lesson_2.level_3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int Num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int Num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int Num3 = scanner.nextInt();

        double Average = ((double) Num1 + (double) Num2 + (double) Num3) / (double) 3;
        System.out.printf("\nThe average of %d, %d and %d is %.2f", Num1, Num2, Num3, Average);

        // Using most "wide" type - will get the same result
        double Average2 = (Num1 + Num2 + Num3) / (double) 3;
        System.out.printf("\n                                %.2f", Average2);

    }
}
