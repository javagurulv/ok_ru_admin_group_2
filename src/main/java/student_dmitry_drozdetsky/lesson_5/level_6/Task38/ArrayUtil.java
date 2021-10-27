package student_dmitry_drozdetsky.lesson_5.level_6.Task38;

import java.util.Random;
import java.util.Arrays;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int findMaxNumber(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }

    public int findMinNumber(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }
}
