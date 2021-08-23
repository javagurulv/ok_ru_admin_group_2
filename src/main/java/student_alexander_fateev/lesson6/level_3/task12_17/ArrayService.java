package student_alexander_fateev.lesson6.level_3.task12_17;

import java.util.Arrays;

class ArrayService {

    void printArrayElements(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    boolean contains(int[] arr, int numberToSearch) {
        return Arrays.stream(arr).anyMatch(i -> i == numberToSearch);
    }

    int numberOfEntries(int[] arr, int numberToSearch) {
        int entries = 0;

        for (int i: arr) {
            if (i == numberToSearch) {
                entries++;
            }
        }

        return entries;
    }

    boolean substituteFirstEntry(int[] arr, int numberToSearch, int newNumber) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == numberToSearch) {
                arr[i] = newNumber;
                return true;
            }
        }

        return false;
    }

    int substituteAllEntries(int[] arr, int numberToSearch, int newNumber) {
        int entries = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == numberToSearch) {
                arr[i] = newNumber;
                entries++;
            }
        }
        return entries;
    }

    int[] reverseArray(int[] arr) {
        int arrayLenght = arr.length;
        int [] newArray = new int[arrayLenght];
        for (int i=0; i<arrayLenght; i++) {
            newArray[arrayLenght - i - 1] = arr[i];
        }

        return newArray;
    }

    void sortArray(int[] arr) {
        int arrayLength = arr.length;
        int tmpNumber;
        int j = arrayLength - 1;

        for (int i=0; i < arrayLength - 1; i++) {
            for (int k = 0; k < j; k++) {
                if (arr[k] > arr[k + 1]) {
                    tmpNumber = arr[k + 1];
                    arr[k + 1] = arr[k];
                    arr[k] = tmpNumber;
                }
            }
            j--;
        }
    }
}
