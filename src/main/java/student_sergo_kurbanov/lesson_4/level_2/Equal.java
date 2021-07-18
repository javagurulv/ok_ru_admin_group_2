package student_sergo_kurbanov.lesson_4.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Equal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        if (first == second) {
            System.out.printf("\n%d and %s are equals", first, second);
        } else {
            System.out.printf("\n%d and %s are different", first, second);
        }
    }
}
