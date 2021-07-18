package student_alexander_fateev.lesson4.level_3.task8;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
        if (compareInts.allEqual()) {
            System.out.println("All numbers are equal");
        }
        else if (compareInts.allDifferent()) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
