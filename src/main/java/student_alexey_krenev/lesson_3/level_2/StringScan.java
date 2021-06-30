package student_alexey_krenev.lesson_3.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class StringScan {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String name = scanner1.nextLine();
        System.out.println("Hello, " +name+ "!");
    }
}
