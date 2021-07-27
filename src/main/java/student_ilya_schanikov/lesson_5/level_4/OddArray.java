package student_ilya_schanikov.lesson_5.level_4;

import java.util.Random;
import java.lang.Math;

public class OddArray {
    public static void main(String[] args) {
        Random tmp = new Random();
        int lenght = Math.abs(tmp.nextInt(100)); // if you have enough mem, you can remove this limit
        int[] numbers = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            Random input = new Random();
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < lenght; i++) {
            System.out.println("Element " + i + " :" + numbers[i]);
        }
        for (int i = 0; i < lenght; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println("Odd element " + i + " :" + numbers[i]);
            }
        }
    }
}