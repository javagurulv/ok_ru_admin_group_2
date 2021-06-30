package student_alexey_krenev.lesson_2.level_3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_11_Average {
    public static void main(String[] args) {
        System.out.println("Insert first int:");
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();

        System.out.println("Insert second int:");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();

        System.out.println("Insert third int:");
        Scanner scanner3 = new Scanner(System.in);
        int thirdNumber = scanner3.nextInt();

        float sum = firstNumber + secondNumber + thirdNumber;


        System.out.println("Average is:"+sum/3);
    }
}
