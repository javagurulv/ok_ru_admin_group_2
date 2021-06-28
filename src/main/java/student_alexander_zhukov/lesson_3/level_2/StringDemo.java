package student_alexander_zhukov.lesson_3.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StringDemo {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("What is your name? (string): ");
        String myName = myInput.next();
        // String myName = "Alexander";
        System.out.println("Hello " + myName + "!");
    }
}
