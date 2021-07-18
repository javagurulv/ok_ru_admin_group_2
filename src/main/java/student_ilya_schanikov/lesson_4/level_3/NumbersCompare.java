package student_ilya_schanikov.lesson_4.level_3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class NumbersCompare {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        System.out.println("Please, enter first number:");
        Scanner userNumber1 = new Scanner(System.in);
        number1 = userNumber1.nextInt();
        System.out.println("Please, enter second number:");
        Scanner userNumber2 = new Scanner(System.in);
        number2 = userNumber2.nextInt();
        System.out.println("Please, enter third number:");
        Scanner userNumber3 = new Scanner(System.in);
        number3 = userNumber3.nextInt();
        if (number1 == number2) {
            if (number1 == number3) {
                System.out.println("All numbers are equal");
            } else {
                System.out.println("Neither all are equal or different");
            }
        } else if (number1 == number3) {
            System.out.println("Neither all are equal or different");
        } else {
            if (number2 == number3) {
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }
        }
    }
}
