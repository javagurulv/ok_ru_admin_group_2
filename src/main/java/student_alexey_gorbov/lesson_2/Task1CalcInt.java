package student_alexey_gorbov.lesson_2;

import java.util.Scanner;

public class Task1CalcInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        System.out.print(firstNumber + " + " + secondNumber + " = ");
        System.out.println(firstNumber + secondNumber);

        System.out.print(firstNumber + " - " + secondNumber + " = ");
        System.out.println(firstNumber - secondNumber);

        System.out.print(firstNumber + " * " + secondNumber + " = ");
        System.out.println(firstNumber * secondNumber);

        if (secondNumber == 0){
            System.out.println("Cant devide by zero");
        } else {
            System.out.print(firstNumber + " / " + secondNumber + " = ");
            System.out.println(firstNumber / secondNumber);
        }
    }
}
