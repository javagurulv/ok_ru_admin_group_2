package student_andrey_tryapichnikov.lesson_4.level_3;

import java.util.Scanner;

public class ThreeNumbersComparison {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var uno = scanner.nextInt();
        var dos = scanner.nextInt();
        var tres = scanner.nextInt();

        if (uno < dos && dos < tres) {
            System.out.println("increasing");
            System.exit(0);
        }

        if (uno > dos && dos > tres) {
            System.out.println("decreasing");
            System.exit(0);
        }

        System.out.println("Neither increasing or decreasing order");
        System.exit(0);
    }
}
