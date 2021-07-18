package student_sergo_kurbanov.lesson_4.level_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class IfPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.printf("\n%d is negative", number);
        } else if (number > 0) {
            System.out.printf("\n%d is positive", number);
        } else {
            System.out.printf("\n%d is zero", number);
        }
    }
}
