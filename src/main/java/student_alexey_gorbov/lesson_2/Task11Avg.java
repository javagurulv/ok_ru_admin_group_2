package student_alexey_gorbov.lesson_2;

import java.util.Scanner;

public class Task11Avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num");
        double firstNum = scanner.nextDouble();

        System.out.println("Enter second num");
        double secondNum = scanner.nextDouble();

        System.out.println("Enter third num");
        double thirdNum = scanner.nextDouble();

        double res = (firstNum +  secondNum + thirdNum)/3;

        System.out.println("Average = " + res);
    }
}
