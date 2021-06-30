package student_alexander_fateev.lesson2.level_3.task9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number from 1 to 10: ");
        int number = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(number + " x " + i + " = " + (number * i) + "\n");
        }
    }
}