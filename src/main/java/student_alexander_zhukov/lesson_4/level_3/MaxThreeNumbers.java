package student_alexander_zhukov.lesson_4.level_3;

import java.util.Scanner;

class MaxThreeNumbers {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Input first number (int): ");
        int firstNumber = myInput.nextInt();
        System.out.println("Input second number (int): ");
        int secondNumber = myInput.nextInt();
        System.out.println("Input third number (int): ");
        int thirdNumber = myInput.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Max number is " + firstNumber);
        }
        else if (secondNumber >= thirdNumber) {
            System.out.println("Max number is " + secondNumber);
        }
        else {
            System.out.println("Max number is " + thirdNumber);
        }

    }
}
