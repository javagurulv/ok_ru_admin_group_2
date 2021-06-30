package student_alexander_fateev.lesson2.level_1.task2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalcReadInputDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input first number (real): ");
        double firstNumber = scan.nextDouble();

        System.out.print("Input second number (real): ");
        double secondNumber = scan.nextDouble();

        System.out.print("Sum: " + (firstNumber + secondNumber) + "\n");
        System.out.print("Substruction: " + (firstNumber - secondNumber) + "\n");
        System.out.print("Multiplication: " + (firstNumber * secondNumber) + "\n");
        System.out.print("Division: " + (firstNumber / secondNumber));
    }
}
