package student_alexey_krenev.lesson_4.level_3;

import java.util.Scanner;

public class TreeNumbersCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );



        System.out.println("Input first num: ");
        int firstNum = scanner.nextInt();

        System.out.println("Input second num: ");
        int secondNum = scanner.nextInt();

        System.out.println("Input third Num: ");
        int thirdNum = scanner.nextInt();


        if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("All Nums are equal");
        }
        else if (firstNum == thirdNum || firstNum == secondNum || secondNum == thirdNum) {
            System.out.println("Neither all are equal or different");
        }
        else {
            System.out.println("All Nums are different");
        }

    }

}
