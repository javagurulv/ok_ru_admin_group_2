package student_sergo_kurbanov.lesson_2.level_3;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double Radius = scanner.nextDouble();

        double Perimeter = 2 * Math.PI * Radius;
        double Area = Math.PI * Math.sqrt(Radius);

        System.out.printf("\nRadius is %.2f", Radius);
        System.out.printf("\nCircle's perimeter: 2 x Pi * %.2f  = %.2f", Radius, Perimeter);
        System.out.printf("\nCircle's area     : Pi * SQRT(%.2f) = %.2f", Radius, Area);
    }
}
