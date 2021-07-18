package student_alexey_gorbov.lesson_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task9TMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        for (int i=0; i<= num; i++){
            System.out.print(i + " * " + num + " = ");
            System.out.println(i*num);
        }
    }
}
