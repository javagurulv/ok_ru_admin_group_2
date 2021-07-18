package student_artem_aleksandrov.lesson2.level3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MuTable {
    public static void main(String[] args) {
        /*
        Test Data:
        Input a number: 8

        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80
         */

        System.out.println("Input a number:");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i < 11 ; i++) {
            System.out.println("%s x %s = %s".formatted(number, i, number * i));
        }


    }
}
