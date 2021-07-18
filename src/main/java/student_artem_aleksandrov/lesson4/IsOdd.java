package student_artem_aleksandrov.lesson4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class IsOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");

        int number = scanner.nextInt();

        if (mod(number) == 0) {
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }

    }
    private static int mod(int number) {
        return number % 2;
    }


}
