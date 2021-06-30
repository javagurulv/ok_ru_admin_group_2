package student_alexander_fateev.lesson4.level_3.task10;

import java.util.Scanner;

class CompareDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int firstNumber = scan.nextInt();
        System.out.print("Input second integer: ");
        int secondNumber = scan.nextInt();
        System.out.print("Input third integer: ");
        int thirdNumber = scan.nextInt();

        Compare compareInts = new Compare(firstNumber, secondNumber, thirdNumber);
        System.out.println(compareInts.getBiggest());
    }
}
