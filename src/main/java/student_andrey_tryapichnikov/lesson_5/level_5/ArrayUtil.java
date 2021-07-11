package student_andrey_tryapichnikov.lesson_5.level_5;

import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        int maxValue = 100;
        var random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % maxValue;
        }
        // Напишите реализацию !!!
    }
}
