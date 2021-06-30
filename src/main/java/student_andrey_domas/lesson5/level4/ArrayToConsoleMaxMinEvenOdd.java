package student_andrey_domas.lesson5.level4;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ArrayToConsoleMaxMinEvenOdd {

    final static int MAX = 5;

    public static void main(String[] args) {
        Random rnd = new Random();

        int a[] = new int[rnd.nextInt(MAX - 1) + 1];  // +1 for case if nextInt() returned 0

        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt();
        }

        int max_a = a[0];
        for (int i: a) {
            if (i > max_a) {
                max_a = i;
            }
        }

        int min_a = a[0];
        for (int i: a) {
            if (i < min_a) {
                min_a = i;
            }
        }

        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Max: " + max_a);
        System.out.println("Min: " + min_a);

        printEven(a);
        printOdd(a);

        // impl. using stream api
        int[] evenIntArr = Arrays.stream(a).filter(x -> x % 2 == 0).toArray();
        int[] oddIntArr = Arrays.stream(a).filter(x -> x % 2 != 0).toArray();
        System.out.println("Even stream: " + Arrays.toString(evenIntArr));
        System.out.println("Odd stream: " + Arrays.toString(oddIntArr));

    }

    static void printEven(int a[]) {
        System.out.print("Even: ");
        boolean can_print_separator = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                // skip ", " separator before first number
                if (can_print_separator) System.out.print(", ");
                can_print_separator = true;
                System.out.print(a[i]);
            }
        }
        System.out.println();
    }

    static void printOdd(int a[]) {
        System.out.print("Even: ");
        boolean can_print_separator = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                // skip ", " separator before first number
                if (can_print_separator) System.out.print(", ");
                can_print_separator = true;
                System.out.print(a[i]);
            }
        }
        System.out.println();
    }
}
