package student_ilya_schanikov.lesson_2.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class HelloUser {
    public static void main(String[] args) {
        Scanner incomingName = new Scanner(System.in);
        System.out.println("Enter your name:");
        String x = incomingName.nextLine();
        System.out.println("Hello " + x +"!");
    }
}
