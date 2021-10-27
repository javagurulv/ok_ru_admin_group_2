package student_dmitry_drozdetsky.lesson_5.level_6.Task34;

import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
    }
}
