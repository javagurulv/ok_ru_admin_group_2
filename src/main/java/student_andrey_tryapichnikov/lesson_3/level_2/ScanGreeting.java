package student_andrey_tryapichnikov.lesson_3.level_2;

import java.util.Scanner;

public class ScanGreeting {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Introduce yourself: ");
        var yourName = scanner.nextLine();

        System.out.printf("Hello %s!", yourName);
    }
}
