package student_alexander_zhukov.lesson_4.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MinTwoNumbers {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Input first number (int): ");
        int firstNumber = myInput.nextInt();
        System.out.println("Input second number (int): ");
        int secondNumber = myInput.nextInt();

        if (firstNumber <= secondNumber) {
            System.out.println(firstNumber + " is min number");
        }
        else {
            System.out.println(secondNumber + " is min number");
        }

    }
}
