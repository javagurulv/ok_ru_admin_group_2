package student_sergo_kurbanov.lesson_5.level_6;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = 0;
        for (int num : array) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = 0;
        for (int num : array) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }
}
