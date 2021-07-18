package student_dmitry_samsonov.lesson_2.level_3;

import java.util.Scanner;
import java.lang.Math;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input circle radius: ");
        var radius = scanner.nextDouble();
        System.out.println("Perimeter is = " + (2 * Math.PI * radius));
        System.out.println("Area is = " + (Math.PI * Math.pow(radius, 2)));
    }
}
