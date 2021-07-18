package student_dmitry_samsonov.lesson_4.level_3_junior;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CompareThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first whole number: ");
        var number1 = scanner.nextInt();
        System.out.println("Enter second whole number: ");
        var number2 = scanner.nextInt();
        System.out.println("Enter third whole number: ");
        var number3 = scanner.nextInt();

        if (allEqual(number1, number2, number3)) {
            System.out.println("All numbers are equal");
        } else if (allDifferent(number1, number2, number3)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

        if (areIncreasing(number1, number2, number3)) {
            System.out.println("Number are increasing");
        } else if (areDecreasing(number1, number2, number3)) {
            System.out.println("Numbers are decreasing");
        } else {
            System.out.println("Number are neither in increasing or decreasing order");
        }
        System.out.println("Biggest number is " + biggest(number1, number2, number3));
    }
    static int biggest(int number1, int number2, int number3) {
        int biggest = number1;
        if (number2 > biggest){
            biggest = number2;
        }
        if (number3 > biggest) {
            biggest = number3;
        }
        return biggest;
    }
    static boolean allEqual(int number1, int number2, int number3) {
        if (number1 == number2 && number2 == number3) {
            return true;
        } else {
            return false;
        }
    }
    static boolean allDifferent(int number1, int number2, int number3) {
        if (number1 != number2 && number2 != number3 && number1 != number3) {
            return true;
        } else {
            return false;
        }
    }
    static boolean areIncreasing(int number1, int number2, int number3) {
        if (number1 < number2 && number2 < number3) {
            return true;
        } else {
            return false;
        }
    }
    static boolean areDecreasing(int number1, int number2, int number3) {
        if (number1 > number2 && number2 > number3) {
            return true;
        } else {
            return false;
        }
    }

}
