package student_dmitry_drozdetsky.lesson_2.level_3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MultTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number from 1 to 10: ");
        var firstNumber = scanner.nextInt();
        for (var i=0; i<=10; i = i +1) {
            System.out.println(firstNumber + " x " + i + " = " + (firstNumber * i));
        }
    }
}
