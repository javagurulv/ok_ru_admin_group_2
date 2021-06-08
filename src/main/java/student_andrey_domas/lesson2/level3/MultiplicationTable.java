package student_andrey_domas.lesson2.level3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int nmbr = 0;
        try {
            nmbr = scnr.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Expected a number");
            System.exit(1);
        }

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " X " + nmbr + " = " + i*nmbr);
        }
    }
}
