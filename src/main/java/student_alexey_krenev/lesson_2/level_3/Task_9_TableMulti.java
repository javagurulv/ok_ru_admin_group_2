package student_alexey_krenev.lesson_2.level_3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_9_TableMulti {
    public static void main(String[] args) {
        System.out.println("Insert int:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(firstNumber+" x "+i+" = "+firstNumber*i);
        }
    }
}
