package student_artem_aleksandrov.lesson2.level3;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your radius");
        int radius = scanner.nextInt();

        double perimeter = 2 * Math.PI * radius;
        double area = 2 * Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter: %,.2f, Area: %,.2f".formatted(perimeter, area));
    }
}
