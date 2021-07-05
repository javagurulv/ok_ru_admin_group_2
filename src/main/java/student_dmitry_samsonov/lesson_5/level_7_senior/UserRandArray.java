package student_dmitry_samsonov.lesson_5.level_7_senior;

import java.util.Scanner;

class UserRandArray {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter array length:");
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = arrayUtil.createArray(ask.nextInt());
        arrayUtil.fillArrayWithRandomNumbers(arr);
        arrayUtil.printArrayToConsole(arr);
    }
}
