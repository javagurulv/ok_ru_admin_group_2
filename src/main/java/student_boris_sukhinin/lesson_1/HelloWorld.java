package student_boris_sukhinin.lesson_1;

import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        final Random random = new Random();
        final int a = random.nextInt(100);
        final int b = random.nextInt(100);

        addNumbersAndPrintResult(a, b);         // Task_11
        multiplyNumbersAndPrintResult(a, b);    // Task_12
        divideNumbersAndPrintResult(a, b);      // Task_11
    }

    private static void addNumbersAndPrintResult(int term1, int term2) {
        final int result = term1 + term2;
        System.out.printf("%d + %d = %d%n", term1, term2, result);
    }

    private static void multiplyNumbersAndPrintResult(int factor1, int factor2) {
        final int result = factor1 * factor2;
        System.out.printf("%d * %d = %d%n", factor1, factor2, result);
    }

    private static void divideNumbersAndPrintResult(int dividend, int divider) {
        if (divider == 0) {
            System.out.printf("%d / %d = ERROR%n", dividend, divider);
        } else {
            final int result = dividend / divider;
            System.out.printf("%d / %d = %d%n", dividend, divider, result);
        }
    }
}
