package student_sergo_kurbanov.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MaxRandSetArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nEnter array length: ");
        int len = scanner.nextInt();
        // TODO check len >= 0 and <= max count user enter

        int[] numbers = new int[len];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        int max = 0;
        for (int num : numbers) {
            System.out.printf("\n%11d", num);
            if (max < num) {
                max = num;
            }
        }
        System.out.printf("\nMax element: %d", max);
    }
}
