package student_artem_khokhlov.lesson_1.task11;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = 0;
        int val2 = 0;

        System.out.println("Enter first number: ");
        val1 = sc.nextInt();
        System.out.println("Enter ssecond number");
        val2 = sc.nextInt();
        System.out.println("Summ: " + (val1 + val2));
    }
}
