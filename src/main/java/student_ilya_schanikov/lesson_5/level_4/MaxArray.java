package student_ilya_schanikov.lesson_5.level_4;

import java.util.Random;
import java.lang.Math;

public class MaxArray {
    public static void main(String[] args) {
        Random tmp = new Random();
        int lenght = Math.abs(tmp.nextInt(1000000)); // if you have enough mem, you can remove this limit
        int[] numbers = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            Random input = new Random();
            numbers[i] = input.nextInt();
        }
        int max = -2147483648;
        for (int i = 0; i < lenght; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Array size is :" + lenght );
        System.out.println("Max element is : " + max );
    }
}