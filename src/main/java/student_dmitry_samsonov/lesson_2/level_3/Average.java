package student_dmitry_samsonov.lesson_2.level_3;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        var firstNumber = scanner.nextInt();
        System.out.println("Enter second integer: ");
        var secondNumber = scanner.nextInt();
        System.out.println("Enter third integer: ");
        var thirdNumber = scanner.nextInt();
        var average = Float.valueOf((firstNumber + secondNumber + thirdNumber)) / 3;

        System.out.println("Average: " + average);
    }
}
