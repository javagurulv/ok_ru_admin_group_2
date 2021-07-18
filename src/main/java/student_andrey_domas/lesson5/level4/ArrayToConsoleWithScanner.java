package student_andrey_domas.lesson5.level4;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayToConsoleWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        int a_len = scanner.nextInt();

        int a[] = new int[Math.abs(a_len)];

        for (int i = 0; i < a.length; i++) {
            System.out.print("int " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(a));
    }
}
