package student_ilya_schanikov.lesson_5.level_2;

import java.util.Random;

public class AvgArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sum = 0;
        for (int i = 0; i <= 2; i++) {
            Random input = new Random();
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i <= 2; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Average : " + (sum/numbers.length));
    }
}
