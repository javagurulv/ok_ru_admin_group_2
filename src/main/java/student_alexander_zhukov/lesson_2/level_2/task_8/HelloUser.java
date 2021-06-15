package student_alexander_zhukov.lesson_2.level_2.task_8;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Input you name: ");
        String userName = myInput.next();
        System.out.println("Hello " + userName + "!");
    }
}
