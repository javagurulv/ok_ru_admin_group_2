package student_dmitry_drozdetsky.lesson_3.level_2.Task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ScannerString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scan.nextLine();

        System.out.println("Hi " + userName + "!");
    }
}
