package student_alexander_zhukov.lesson_5.level_7;

import java.util.Random;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }
    }

    public void printArrayToConsole(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
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

    public void printEvenNumbers(int [] array) {
        System.out.print("Even elements: ");
        for (int element : array) {
            if (element % 2 == 0){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public void printOddNumbers(int [] array) {
        System.out.print("Odd elements: ");
        for (int element : array) {
            if (element % 2 != 0){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public int inputArrayLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array length (int): ");
        return scanner.nextInt();
    }

    public void fillArrayFromUser(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array elements (int): ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public int getRandomArrayLength() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

}
