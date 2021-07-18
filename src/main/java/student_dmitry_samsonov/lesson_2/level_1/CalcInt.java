package student_dmitry_samsonov.lesson_2.level_1;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalcInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        var firstNumber = scanner.nextInt();
        System.out.println("Enter second integer: ");
        var secondNumber = scanner.nextInt();

        System.out.println("Number received: " + firstNumber + ", " + secondNumber);

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        if (secondNumber == 0) {
            System.out.println("Division by zero impossible");
        } else {
            System.out.println("Division: " + (firstNumber / secondNumber));
        }
    }
}
