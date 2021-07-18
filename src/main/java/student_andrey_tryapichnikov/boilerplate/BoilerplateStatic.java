package student_andrey_tryapichnikov.boilerplate;

import java.util.Scanner;

public class BoilerplateStatic {
    public static int[] queryNumbers (int qty, String desc) {
        var scanner = new Scanner(System.in);
        System.out.printf(desc, qty);
        int[] numbers = new int[qty];
        for (int i = 0; i < qty; i++) numbers[i] = scanner.nextInt();
        return numbers;
    }

    public static int[] queryNumberDefault(int qty) {
        return queryNumbers(qty, "Enter %s numbers: ");
    }

    public static void printTestResult(boolean result, String okTemplate, String failTemplate, String value) {
        if (result) System.out.printf(okTemplate, value);
        else System.out.printf(failTemplate, value);
    }

    public static void printTestResult(boolean result, String okValue, String failValue) {
        printTestResult(result, okValue + "\n", failValue + "\n", "");
    }

    public static void printTestResult(boolean result) {
        printTestResult(result, "OK\n", "FAIL\n", "");
    }
}
