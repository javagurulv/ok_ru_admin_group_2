package student_alexander_fateev.lesson2.level_2.task8;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Username: ");
        String userName = scan.nextLine();
        System.out.print("Hello " + userName);
    }
}
