package student_ilya_schanikov.lesson_3.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SayMyName {
    public static void main(String[] args) {
        String name = "Ilya";
        String welcome = "Hi " + name + "!";
        System.out.println(name);
        System.out.println(welcome);

        System.out.println("Please, enter your name!");
        Scanner incomingName = new Scanner(System.in);
        String x = incomingName.nextLine();
        String addressedGreeting = "Hello " + x + "!";
        System.out.println(addressedGreeting);
    }
}
