package student_sergo_kurbanov.lesson_5.level_2;

import java.util.Random;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DoubleRandArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        for (int num : numbers) {
            System.out.println(num);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
        }

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
