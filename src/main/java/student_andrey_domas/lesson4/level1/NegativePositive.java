package student_andrey_domas.lesson4.level1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class NegativePositive {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scnr = new Scanner(System.in);
        final float number = scnr.nextFloat();

        if (number == 0)
            System.out.println("Zero");
        else if (number > 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}
