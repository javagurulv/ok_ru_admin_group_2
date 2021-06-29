package student_alexander_zhukov.lesson_4.level_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Positive {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Input number (int): ");
        int number = myInput.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        }
        else if (number == 0) {
            System.out.println("Number is equal 0");
        }
        else {
            System.out.println("Number is negative");
        }
    }
}
