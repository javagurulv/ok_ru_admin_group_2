package student_alexander_zhukov.lesson_4.level_3;

import java.util.Scanner;

class IncreaseDecrease {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Input first number (int): ");
        int firstNumber = myInput.nextInt();
        System.out.println("Input second number (int): ");
        int secondNumber = myInput.nextInt();
        System.out.println("Input third number (int): ");
        int thirdNumber = myInput.nextInt();

        if (firstNumber <= secondNumber && secondNumber <= thirdNumber) {
            System.out.println("increasing");
        }
        else if (firstNumber >= thirdNumber && secondNumber >= thirdNumber) {
            System.out.println("decreasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }

    }
}
