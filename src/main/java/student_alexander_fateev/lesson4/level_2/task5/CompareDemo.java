package student_alexander_fateev.lesson4.level_2.task5;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CompareDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int firstNumber = scan.nextInt();
        System.out.print("Input first integer: ");
        int secondNumber = scan.nextInt();

        Compare compareInts = new Compare(firstNumber, secondNumber);
        System.out.println(compareInts.getBigger());
    }
}
