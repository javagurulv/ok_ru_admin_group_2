package student_alexey_krenev.lesson_2.level_3;

import java.util.Scanner;
import java.lang.Math;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_10_Radius {
    public static void main(String[] args) {
        System.out.println("Insert radius:");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter is: "+perimeter);

        double area = Math.PI*radius*radius;
        System.out.println("Area is: "+area);
    }
}
