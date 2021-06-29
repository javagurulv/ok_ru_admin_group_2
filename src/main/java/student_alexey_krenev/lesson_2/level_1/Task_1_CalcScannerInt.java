package student_alexey_krenev.lesson_2.level_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_1_CalcScannerInt {
    public static void main(String[] args) {
        System.out.println("Insert first int:");
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();

        System.out.println("Insert second int:");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();

        System.out.println(firstNumber+secondNumber);

    }
}
