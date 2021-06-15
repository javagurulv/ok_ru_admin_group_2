package student_alexander_zhukov.lesson_2.level_1.task_2;

import java.util.Scanner;

public class CalcDouble {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter first number (double): ");
        double firstNum = myInput.nextDouble();
        System.out.println("Enter second number (double): ");
        double secondNum = myInput.nextDouble();
        System.out.println("Addition: " + (firstNum + secondNum));
        System.out.println("Subtraction: " + (firstNum - secondNum));
        System.out.println("Multiplication: " + (firstNum*secondNum));
        System.out.println("Division: " + (firstNum/secondNum));
    }
}
