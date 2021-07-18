package student_dmitry_samsonov.lesson_6.level_4_junior;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArray {
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
    public void printArrayToConsole(int[] array) {
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
    public int sumArrayElements(int[] array){
        int sum = 0;
        for (int i: array) {
            sum += i;
        }
        return sum;
    }
}
