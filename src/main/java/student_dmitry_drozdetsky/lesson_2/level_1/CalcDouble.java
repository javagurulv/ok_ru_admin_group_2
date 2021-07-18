package student_dmitry_drozdetsky.lesson_2.level_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalcDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first double: ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter second double: ");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.print("Summa: " + (firstDoubleNumber + secondDoubleNumber) + "\n");
        System.out.print("Subtraction: " + (firstDoubleNumber - secondDoubleNumber) + "\n");
        System.out.print("Multiplication: " + (firstDoubleNumber * secondDoubleNumber) + "\n");

        if (secondDoubleNumber == 0D) {
            System.out.print("Division by null impossible");
        } else {
            System.out.print("Division: " + (firstDoubleNumber / secondDoubleNumber));
        }
    }
}
