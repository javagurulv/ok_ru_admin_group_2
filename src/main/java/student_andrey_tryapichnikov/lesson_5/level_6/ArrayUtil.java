package student_andrey_tryapichnikov.lesson_5.level_6;

import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array, int maxValue) {
        var random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt() % maxValue;
    }

    public void printArrayToConsole(int[] array) {
        for (int i: array) System.out.println(i);
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxNumber < array[i]) maxNumber = array[i];
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minNumber > array[i]) minNumber = array[i];
        }
        return minNumber;
    }
}
