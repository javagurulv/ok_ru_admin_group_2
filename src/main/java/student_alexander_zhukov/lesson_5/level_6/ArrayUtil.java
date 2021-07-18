package student_alexander_zhukov.lesson_5.level_6;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

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
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public int findMinNumber(int[] array) {
        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minNum) {
                minNum = array[i];
            }
        }
        return minNum;
    }


}
