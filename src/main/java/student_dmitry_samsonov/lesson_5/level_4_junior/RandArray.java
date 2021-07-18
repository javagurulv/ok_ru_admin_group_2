package student_dmitry_samsonov.lesson_5.level_4_junior;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RandArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[rnd.nextInt(10)];
        for (int i=0; i<arr.length; i++) {
            arr[i] = rnd.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
        System.out.println("arr max: " + max(arr));
        System.out.println("arr min: " + min(arr));
        printEven(arr);
        printOdd(arr);
    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int[] arr){
        int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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
