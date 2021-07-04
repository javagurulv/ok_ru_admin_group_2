package student_alexey_gorbov.lesson_2;

import java.util.Scanner;

public class Task10Cyrcle {
    public static void main(String[] args) {
        System.out.println("Enter radius of cyrcle");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double perimetr = 2 * 3.1415926 * radius;
        double area = 3.1415926 * radius * radius;
        System.out.println("Perimetr is " + perimetr);
        System.out.println("Area is " + area);
    }
}
