package student_ilya_schanikov.lesson_5.level_2;

import java.util.Random;

public class SumArray {
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
        System.out.println("Sum : " + sum);
    }
}
