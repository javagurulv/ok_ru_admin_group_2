package student_sergo_kurbanov.lesson_2.level_3;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("\nRadius is %.2f", radius);
        System.out.printf("\nCircle's perimeter: 2 x Pi * %.2f  = %.2f", radius, perimeter);
        System.out.printf("\nCircle's area     : Pi * SQRT(%.2f) = %.2f", radius, area);
    }
}
