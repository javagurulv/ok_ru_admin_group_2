package student_andrey_tryapichnikov.lesson_4.level_1;

import java.util.Scanner;

public class RelToZeroDemo {
    static String status(int number) {
        if (RelToZero.isPositive(number)) return "positive";
        if (RelToZero.isNegative(number)) return "negative";
        return "zero";
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        var value = scanner.nextInt();

        var status = status(value);
        System.out.printf("The number %s is %s!\n", value, status);
    }
}
