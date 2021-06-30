package student_alexander_fateev.lesson2.level_1.task1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalcReadInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input first number (integer): ");
        int firstNumber = scan.nextInt();

        System.out.print("Input second number (integer): ");
        int secondNumber = scan.nextInt();

        System.out.print("Sum: " + (firstNumber + secondNumber) + "\n");
        System.out.print("Substruction: " + (firstNumber - secondNumber) + "\n");
        System.out.print("Multiplication: " + (firstNumber * secondNumber) + "\n");
        System.out.print("Division: " + (firstNumber / secondNumber));
    }
}