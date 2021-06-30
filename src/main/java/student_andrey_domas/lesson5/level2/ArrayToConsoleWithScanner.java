package student_andrey_domas.lesson5.level2;

import java.util.Scanner;

public class ArrayToConsoleWithScanner {
    public static void main(String[] args) {
        int a[] = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter int " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        for (int i: a)
            System.out.println(i);
    }
}
