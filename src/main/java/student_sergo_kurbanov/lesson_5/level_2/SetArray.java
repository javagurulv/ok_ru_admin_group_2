package student_sergo_kurbanov.lesson_5.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SetArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter the number (%d/%d): ", i + 1, numbers.length);
            numbers[i] = scanner.nextInt();
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
