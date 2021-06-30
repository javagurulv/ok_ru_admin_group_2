package student_alexander_fateev.lesson3.level_2.task9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StringsInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String userName = scan.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
