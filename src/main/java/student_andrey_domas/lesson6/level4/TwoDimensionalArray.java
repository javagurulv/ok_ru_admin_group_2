package student_andrey_domas.lesson6.level4;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        // 2d-array
        int arr[][] = new int[23][32];

        // fill
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = rnd.nextInt();

        int accum = 0; // SUM!
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                accum += arr[i][j];
    }
}
