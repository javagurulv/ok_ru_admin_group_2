package student_ilya_schanikov.lesson_5.level_4;

import java.util.Random;
import java.lang.Math;

public class MinArray {
    public static void main(String[] args) {
        Random tmp = new Random();
        int lenght = Math.abs(tmp.nextInt(1000000)); // if you have enough mem, you can remove this limit
        int[] numbers = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            Random input = new Random();
            numbers[i] = input.nextInt();
        }
        int min = 2147483647;
        for (int i = 0; i < lenght; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Array size is :" + lenght);
        System.out.println("Min element is : " + min);
    }
}
