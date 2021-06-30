package student_alexey_krenev.lesson_4.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class IsLesser {

    public static void main(String[] args) {
        System.out.println("Insert first int number: ");
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();

        System.out.println("Insert first int number: ");
        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner2.nextInt();

        if(num1 < num2){
            System.out.println("Number 1 is lesser than number 2 and is " +num1);
        }
        else {
            System.out.println("Number 2 is lesser than number 1 and is " +num2);
        }


    }
}
