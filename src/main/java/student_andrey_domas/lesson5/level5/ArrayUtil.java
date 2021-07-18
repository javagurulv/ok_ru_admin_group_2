package student_andrey_domas.lesson5.level5;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i: array) {
            System.out.println(i);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for(int i: array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i: array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}