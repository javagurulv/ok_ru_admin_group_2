package student_dmitry_drozdetsky.lesson_2.level_3;

import java.util.Scanner;

public class CircleRadius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Perimeter = " + (2 * Math.PI * radius) + "\n");
        System.out.print("Area = " + (Math.PI * Math.pow(radius, 2)));
    }
}
