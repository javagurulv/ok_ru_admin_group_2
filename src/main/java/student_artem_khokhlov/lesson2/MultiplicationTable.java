package student_artem_khokhlov.lesson2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MultiplicationTable {
    public static void main(String[] args) {
        int number;
        int result;
        Scanner scan = new Scanner(System.in);

        try {
            number = scan.nextInt();
        }
        catch (java.util.InputMismatchException err) {
            System.out.println("Value is not int. Exit");
            return;
        }

        System.out.println("Enter number: ");
        for(int i = 0; i <=10; i++) {
            result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
