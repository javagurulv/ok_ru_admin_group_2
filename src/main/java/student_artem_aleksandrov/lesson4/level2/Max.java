package student_artem_aleksandrov.lesson4.level2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
           System.out.println(number1);
        }
        else {
            System.out.println(number2);
        }
    }
}
