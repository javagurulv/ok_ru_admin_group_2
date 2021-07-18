package student_andrey_tryapichnikov.lesson_2.level_3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MultiplicationTable {
    static final int[] MULTIPLIERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        double value = scanner.nextDouble();

        for (int multiplier : MULTIPLIERS) System.out.printf("%s × %s = %s\n", multiplier, value, multiplier * value);
        System.out.println("That's all folks!");
    }
}
