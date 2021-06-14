package student_dmitry_drozdetsky.lesson_2.level_1;

import java.util.Scanner;

public class CalcInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first int: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second int: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Summa: " + (firstNumber + secondNumber) + "\n");
        System.out.print("Subtraction: " + (firstNumber - secondNumber) + "\n");
        System.out.print("Multiplication: " + (firstNumber * secondNumber) + "\n");

        if (secondNumber == 0) {
            System.out.print("Division by null impossible");
        } else {
            System.out.print("Division: " + (firstNumber / secondNumber));
        }
    }
}