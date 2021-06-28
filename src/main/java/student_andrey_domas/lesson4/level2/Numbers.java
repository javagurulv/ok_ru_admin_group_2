package student_andrey_domas.lesson4.level2;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number 1: ");
        final int n1 = scanner.nextInt();

        System.out.print("Enter a number 2: ");
        final int n2 = scanner.nextInt();

        // Numbers are equals
        if(n1 == n2)
            System.out.println(n1 + " == " + n2);

        // Numbers are different, >
        else if (n1 > n2)
            System.out.println(n1 + " > " + n2);

        // Numbers are different, <
        else
            System.out.println(n1 + " < " + n2);
    }
}
