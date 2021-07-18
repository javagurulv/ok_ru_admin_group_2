package student_dmitry_samsonov.lesson_6.level_3_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayService {
    boolean contains(int[] arr, int numberToSearch){
        for (int i: arr) {
            if (i == numberToSearch) {
                return true;
            }
        }
        return false;
    }
    int countOccurrences(int[] arr, int numberToSearch){
        int count = 0;
        for (int i: arr) {
            if (i == numberToSearch) {
                count++;
            }
        }
        return count;
    }
    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = numberToReplace;
                return true;
            }
        }
        return false;
    }
    int replaceAll(int[] arr, int numberToReplace, int newNumber){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = numberToReplace;
                count++;
            }
        }
        return count;
    }
    boolean isEven(int number) {
        return number %2 == 0;
    }
    void revert(int[] arr){
        int temp;
        int halfArrLength;
        if (isEven(arr.length)) {
            halfArrLength = arr.length / 2;
        } else {
            halfArrLength = (arr.length - 1) / 2;
        }
        for (int i=0; i<halfArrLength; i++){
            temp = arr[i];
            int minusI = arr.length - 1 - i;
            arr[i] = arr[minusI];
            arr[minusI] = temp;
        }
    }
    public void printArrayToConsole(int[] array) {
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
    void sort(int[] arr){
        boolean changed = true;
        int temp;
        while (changed) {
            changed = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i+1]) {
                    continue;
                }
                changed = true;
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
}
