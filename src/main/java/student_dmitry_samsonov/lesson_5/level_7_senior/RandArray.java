package student_dmitry_samsonov.lesson_5.level_7_senior;

import java.util.Random;

class RandArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = arrayUtil.createArray(rnd.nextInt(10));
        arr = arrayUtil.fillArrayWithRandomNumbers(arr);
        arrayUtil.printArrayToConsole(arr);
        System.out.println("arr max: " + arrayUtil.findMaxNumber(arr));
        System.out.println("arr min: " + arrayUtil.findMinNumber(arr));
        printEven(arr);
        printOdd(arr);
    }
    static void printOdd(int[] arr){
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Odd: " + arr[i]);
            }
        }
    }
    static void printEven(int[] arr){
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even: " + arr[i]);
            }
        }
    }
}
