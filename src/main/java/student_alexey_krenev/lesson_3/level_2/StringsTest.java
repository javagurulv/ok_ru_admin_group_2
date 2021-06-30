package student_alexey_krenev.lesson_3.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class StringsTest {
    public static void main(String[] args) {
        String myName = "Alexey";
        System.out.println(myName);

        String greeting = "Hi " + myName + "!";
        System.out.println(greeting);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String name = scanner1.nextLine();
        System.out.println("Hello, "+name);
    }
}
