package student_alexey_krenev.lesson_5.level_5;


import java.util.Random;


class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i: array) {
            array[i] = random.nextInt();
        }
    }
}