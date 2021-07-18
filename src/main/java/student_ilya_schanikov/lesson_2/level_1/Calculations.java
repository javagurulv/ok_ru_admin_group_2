package student_ilya_schanikov.lesson_2.level_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Calculations {
    public static void main(String[] args) {
        int x, y;
        Scanner incomingNumber = new Scanner(System.in);
        System.out.println("Enter first number:");
        x = incomingNumber.nextInt();
        System.out.println("Enter second number:");
        y = incomingNumber.nextInt();
        System.out.println("Sum : " + (x + y));
        System.out.println("Subtraction : " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
    }
}
