package student_alexander_zhukov.lesson_2.level_1.task_1;

import java.util.Scanner;

public class CalcInt {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter first number (int): ");
        int firstNum = myInput.nextInt();
        System.out.println("Enter second number (int): ");
        int secondNum = myInput.nextInt();
        System.out.println("Addition: " + (firstNum + secondNum));
        System.out.println("Subtraction: " + (firstNum - secondNum));
        System.out.println("Multiplication: " + (firstNum*secondNum));
        System.out.println("Division: " + (firstNum/secondNum));
    }
}