package student_artem_aleksandrov.lesson5.level1.level5;

/*
Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.
 */


import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i=0; i<array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];

        for (int i=1; i<array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}