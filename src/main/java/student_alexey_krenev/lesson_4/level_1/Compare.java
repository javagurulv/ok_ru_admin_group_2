package student_alexey_krenev.lesson_4.level_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Compare {

    public static void main(String[] args) {
        System.out.println("Insert Int number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("Number is positive");
        }

        if(num < 0){
            System.out.println("num is negative");
        }
    }

}
