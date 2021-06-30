package student_andrey_domas.lesson5.level4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayToConsoleWithScannerAndRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        int a_len = scanner.nextInt();
        int a_len_abs = Math.abs(a_len);

        int a[] = new int[a_len_abs];

        Random rnd = new Random();

        for (int i = 0; i < a.length; i++)
            a[i] = rnd.nextInt();

        System.out.println(Arrays.toString(a));

    }
}
