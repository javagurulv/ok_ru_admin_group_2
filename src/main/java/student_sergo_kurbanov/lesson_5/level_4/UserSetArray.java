package student_sergo_kurbanov.lesson_5.level_4;

import java.util.Scanner;

public class UserSetArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nEnter array length: ");
        int len = scanner.nextInt();
        // TODO check len >= 0 and <= max count user enter

        int[] numbers = new int[len];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter the number (%d/%d): ", i + 1, numbers.length);
            numbers[i] = scanner.nextInt();
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
