package student_dmitry_samsonov.lesson_4.level_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first whole number: ");
        var number1 = scanner.nextInt();
        System.out.println("Enter second whole number: ");
        var number2 = scanner.nextInt();
        int biggest = 0;
        int smallest = 0;
        boolean different = false;
        if (number1 > number2) {
            biggest = number1;
            smallest = number2;
            different = true;
        } else if (number2 > number1) {
            biggest = number2;
            smallest = number1;
            different = true;
        }
        if (different) {
            System.out.println(biggest + " is biggest");
            System.out.println(smallest + " is smallest");
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equals");
        }
    }
}
