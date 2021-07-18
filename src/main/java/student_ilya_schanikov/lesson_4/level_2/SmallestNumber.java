package student_ilya_schanikov.lesson_4.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SmallestNumber {
    public static void main(String[] args) {
        int number1;
        int number2;
        System.out.println("Please, enter first number:");
        Scanner userNumber1 = new Scanner(System.in);
        number1 = userNumber1.nextInt();
        System.out.println("Please, enter second number:");
        Scanner userNumber2 = new Scanner(System.in);
        number2 = userNumber2.nextInt();
        if (number1 == number2) {
            System.out.println("Numbers are same!");
        } else if (number1 > number2) {
            System.out.println("Smallest number is:" + number2);
        } else {
            System.out.println("Smallest number is:" + number1);
        }
    }

}
