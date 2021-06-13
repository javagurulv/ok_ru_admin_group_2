package student_sergo_kurbanov.lesson_2.level_3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int multiplier: ");
        int iMultiplier = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.printf("\n%2d. %2d x %2d = %3d", i + 1, iMultiplier, i + 1, iMultiplier * (i + 1));
        }
    }
}
