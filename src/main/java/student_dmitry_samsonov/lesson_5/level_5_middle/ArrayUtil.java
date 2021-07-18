package student_dmitry_samsonov.lesson_5.level_5_middle;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] arr = new int[arrayLength];
        return arr;
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        Random rnd = new Random();
        for (int i=0; i<array.length; i++) {
            array[i] = rnd.nextInt();
        }
    }
}