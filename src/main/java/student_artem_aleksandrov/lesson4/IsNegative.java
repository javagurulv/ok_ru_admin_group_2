package student_artem_aleksandrov.lesson4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class IsNegative {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");

        number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Negative");
        } else if (number > 0){
            System.out.println("Pozitive");
        } else{
            System.out.println("Zero");
        }

    }
}
