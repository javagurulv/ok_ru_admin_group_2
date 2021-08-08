package student_artem_aleksandrov.lesson6.level3;

import java.util.Random;

public class ArrayService {

    public static int[] createRandomArray(int length) {
        int[] array = new int[length];
        Random random  = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static boolean contains(int[] array, int numberToSearch) {
        for (int i:array) {
            if (numberToSearch == i) {
                return true;
            }
        }
        return false;
    }

    public static int countOccurrences(int[] array, int numberToSearch) {
        int counter = 0;
        for (int i:array) {
            if (array[i] == numberToSearch) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}

