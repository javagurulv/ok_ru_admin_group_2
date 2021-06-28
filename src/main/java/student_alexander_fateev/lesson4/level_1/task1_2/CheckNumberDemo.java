package student_alexander_fateev.lesson4.level_1.task1_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = false)
class CheckNumberDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input integer: ");
        int number = scan.nextInt();

        CheckNumber myNumber = new CheckNumber(number);
        if (myNumber.isPositive()) {
            System.out.print("Positive");
        }
        else if (myNumber.isZero()) {
            System.out.print("Zero");
        }
        else {
            System.out.print("Negative");
        }
    }
}
