package student_andrey_domas.lesson4.level1;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
