package student_sergo_kurbanov.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class MinRandSetArray {
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

        int min = 0;
        for (int num : numbers) {
            System.out.printf("\n%11d", num);
            if (min > num) {
                min = num;
            }
        }
        System.out.printf("\nMin element: %d", min);
    }
}