package student_andrey_domas.lesson2.level3;

import java.util.List;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MeanCalc {
    public static void main(String[] args) {
        System.out.print("Enter three space separated numbers: ");
        Scanner scnr = new Scanner(System.in);
        final String input = scnr.nextLine();

        String[] strings = input.split(" ");

        float sum = 0;
        for (String s: strings) {
            sum += Float.parseFloat(s);
        }

        System.out.println("Mean: " + sum / strings.length);
    }
}
