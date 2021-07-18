package student_sergo_kurbanov.lesson_2.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name please: ");
        String name = scanner.nextLine();
        // TODO 1 have to check correct input

        if (name.equals("")) System.out.println("Fuck off!");
        else System.out.printf("Hello, %s!", name);
    }
}
