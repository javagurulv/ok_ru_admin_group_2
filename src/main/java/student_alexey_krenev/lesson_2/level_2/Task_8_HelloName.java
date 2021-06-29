package student_alexey_krenev.lesson_2.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_8_HelloName {
    public static void main(String[] args) {
        System.out.println("Enter name: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello, "+name+"!");
    }
}
