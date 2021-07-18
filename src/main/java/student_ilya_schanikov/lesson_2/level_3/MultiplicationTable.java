package student_ilya_schanikov.lesson_2.level_3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MultiplicationTable {
    public static void main(String[] args) {
        int x;
        Scanner incomingNumber = new Scanner(System.in);
        System.out.println("Enter your number:");
        x = incomingNumber.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }
}
