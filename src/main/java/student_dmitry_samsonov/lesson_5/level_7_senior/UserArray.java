package student_dmitry_samsonov.lesson_5.level_7_senior;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserArray {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter array length:");
        int[] arr = arrayUtil.createArray(ask.nextInt());
        for (int i=0; i<arr.length; i++) {
            System.out.println("Enter number" + i + ":");
            arr[i] = ask.nextInt();
        }
        arrayUtil.printArrayToConsole(arr);
    }
}
