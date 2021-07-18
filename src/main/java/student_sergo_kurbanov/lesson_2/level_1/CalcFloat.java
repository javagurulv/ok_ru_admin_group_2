package student_sergo_kurbanov.lesson_2.level_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalcFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter float number: ");
        float fFirst = scanner.nextFloat();
        System.out.print("Enter non zero float number: ");
        double fSecond = scanner.nextDouble();
        // TODO 1 check correct input
        // TODO 2 handle divide by zero

        System.out.printf("1. %.2f + %.2f = %.2f", fFirst, fSecond, fFirst + fSecond);
        System.out.printf("\n2. %.2f - %.2f = %.2f", fFirst, fSecond, fFirst - fSecond);
        System.out.printf("\n3. %.2f * %.2f = %.2f", fFirst, fSecond, fFirst * fSecond);
        System.out.printf("\n4. %.2f / %.2f = %.2f", fFirst, fSecond, fFirst / fSecond);
    }
}
