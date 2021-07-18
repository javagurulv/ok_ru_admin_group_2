package student_sergo_kurbanov.lesson_2.level_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalcInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int number: ");
        int iFirst = scanner.nextInt();

        System.out.print("Enter non zero int number: ");
        int iSecond = scanner.nextInt();
        // TODO 1 have to check correct input
        // TODO 2 have to handle divide by zero

        System.out.printf("1. %d + %d = %d", iFirst, iSecond, iFirst + iSecond);
        System.out.printf("\n2. %d - %d = %d", iFirst, iSecond, iFirst - iSecond);
        System.out.printf("\n3. %d * %d = %d", iFirst, iSecond, iFirst * iSecond);
        System.out.printf("\n4. %d / %d = %d", iFirst, iSecond, iFirst / iSecond);
    }
}
