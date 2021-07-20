package student_ilya_schanikov.lesson_5.level_2;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i <= 2; i++) {
            Random input = new Random();
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i <= 2; i++) {
            System.out.println("Element " + i + " :" + numbers[i]);
        }
    }
}
