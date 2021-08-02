package student_artem_aleksandrov.lesson6.level4;

import java.util.Random;

/*
Создайте класс TwoDimensionalArray и в нём напишите программу в которой:
- создайте двумерный массив;
- заполните двумерный массив случайными числами;
- посчитайте сумму всех чисел в двумерном массиве.
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] array = new int[10][10];

        fillTwoDimArray(array);
        System.out.println(calculateTwoDimArray(array));
    }

    public static void fillTwoDimArray(int [][] array) {
        Random random = new Random();
        for (int[] row : array) {
            for (int i = 0; i < row.length; i++) {
                row[i] = random.nextInt();
            }
        }
    }

    public static int calculateTwoDimArray(int [][] array) {
        int sum = 0;
        for (int[] row:array) {
            for (int i = 0; i < row.length; i++) {
                sum = sum + row[i];
            }
        }
        return sum;
    }

}
