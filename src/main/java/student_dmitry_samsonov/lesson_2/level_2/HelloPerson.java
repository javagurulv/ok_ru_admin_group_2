package student_dmitry_samsonov.lesson_2.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class HelloPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name: ");
        var name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
