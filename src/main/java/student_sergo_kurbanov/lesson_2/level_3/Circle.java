package student_sergo_kurbanov.lesson_2.level_3;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double fRadius = scanner.nextDouble();

        double Perimeter = 2 * Math.PI * fRadius;
        double Area = Math.PI * Math.sqrt(fRadius);

        System.out.printf("\nRadius is %.2f", fRadius);
        System.out.printf("\nCircle's perimeter: 2 x Pi * %.2f  = %.2f", fRadius, Perimeter);
        System.out.printf("\nCircle's area     : Pi * SQRT(%.2f) = %.2f", fRadius, Area);
    }
}
