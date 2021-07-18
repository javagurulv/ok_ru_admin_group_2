package student_boris_sukhinin.lesson_2.level_3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        final Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println("" + number + " x " + i + " = " + (number * i));
        }
    }
}
