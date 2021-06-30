package student_andrey_tryapichnikov.boilerplate;

import java.util.Scanner;

public class ScannerQuery {
    public static int[] queryNumbers (int qty, String desc) {
        var scanner = new Scanner(System.in);
        System.out.printf(desc, qty);
        int[] numbers = new int[qty];
        for (int i = 0; i < qty; i++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static int[] queryNumberDefault(int qty) {
        return queryNumbers(qty, "Enter %s numbers: ");
    }
}
