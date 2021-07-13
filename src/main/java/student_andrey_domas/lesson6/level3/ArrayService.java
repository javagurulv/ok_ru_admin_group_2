package student_andrey_domas.lesson6.level3;

import student_sergo_kurbanov.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayService {

    private static int getFirstOccurrenceIndex(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return i;
            }
        }
        return -1;
    }

    private static Integer[] getAllOccurrencesIndexes(int[] arr, int numberToSearch) {
        var indexesSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                indexesSet.add(i);
            }
        }
        return indexesSet.toArray(Integer[]::new);
    }

    static boolean contains(int[] arr, int numberToSearch) {
        return getFirstOccurrenceIndex(arr, numberToSearch) > -1;
    }

    static int countOccurrences(int[] arr, int numberToSearch) {
        int occurrences = 0;
        for (int i: arr) {
            if (i == numberToSearch) {
                occurrences++;
            }
        }
        return occurrences;
    }

    static boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        int idx = getFirstOccurrenceIndex(arr, numberToReplace);
        if (idx < 0)
            return false;
        arr[idx] = newNumber;
        return true;
    }

    static int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int replaced = 0;
        for (int i: getAllOccurrencesIndexes(arr, numberToReplace)) {
            arr[i] = newNumber;
            replaced++;
        }
        return replaced;
    }

    static void revert(int[] arr) {
        for (int i = 0; i <= arr.length / 2 - 1; i++) {
            int swap_idx = arr.length - 1 - i;
            int tmp = arr[i];
            arr[i] = arr[swap_idx];
            arr[swap_idx] = tmp;
        }
    }

    /**
     * Gnome sorting algo.
     */
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i == 0)
                i++;
            if (arr[i] >= arr[i - 1])
                i++;
            else {
                int tmp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = tmp;
                i--;
            }
        }
    }
}
