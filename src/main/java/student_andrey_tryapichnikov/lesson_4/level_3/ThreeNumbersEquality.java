package student_andrey_tryapichnikov.lesson_4.level_3;

import java.util.Scanner;

public class ThreeNumbersEquality {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var uno = scanner.nextInt();
        var dos = scanner.nextInt();
        var tres = scanner.nextInt();

        if (uno == dos && uno == tres ) {
            System.out.println("All numbers are equal");
            System.exit(0);
        }

        if (uno != dos && uno != tres && dos != tres) {
            System.out.println("All numbers are different");
            System.exit(0);
        }

        System.out.println("Neither all are equal or different");
        System.exit(1);
    }
}
