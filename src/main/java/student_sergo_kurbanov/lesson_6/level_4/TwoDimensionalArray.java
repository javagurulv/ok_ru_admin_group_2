package student_sergo_kurbanov.lesson_6.level_4;

import java.util.Random;

public class TwoDimensionalArray {
    public int[][] CreateArray(int rows, int columns) {
        return new int[rows][columns];
    }

    public void FillArray(int[][] array, int rows, int columns) {
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = rand.nextInt();
            }
        }
    }

    public int SumArray(int[][] array, int rows, int columns) {
        Random rand = new Random();
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
