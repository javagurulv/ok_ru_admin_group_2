package student_alexander_zhukov.lesson_4.level_3;

import java.util.Scanner;

class IsEqualTreeNumbers {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Input first number (int): ");
        int firstNumber = myInput.nextInt();
        System.out.println("Input second number (int): ");
        int secondNumber = myInput.nextInt();
        System.out.println("Input third number (int): ");
        int thirdNumber = myInput.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        }
        else if (firstNumber == thirdNumber || firstNumber == secondNumber || secondNumber == thirdNumber) {
            System.out.println("Neither all are equal or different");
        }
        else {
            System.out.println("All numbers are different");
        }

    }
}
