package student_andrey_tryapichnikov.lesson_2.level_3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CircleCalc {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Input radius: ");

        var radius = scanner.nextDouble();
        /* some math follows
           Circumference = 2 * pi * r
           Area = pi * r ^ 2 */

        var circumference = 2 * Math.PI * radius;
        var area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Here, have a nice circle:\nRadius = %s\nArea = %s\nCircumference = %s\n", radius, circumference, area);
    }
}
