package student_sergo_kurbanov.lesson_6.level_3;

public class ArrayService {
    private int[] numbers;

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    boolean contains(int numberToSearch) {
        return contains(this.numbers, numberToSearch);
    }

    boolean contains(int[] arr, int numberToSearch) {
        for (int num : arr) {
            if (num == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;

        for (int num : arr) {
            if (num == numberToSearch) {
                count++;
            }
        }
        return count;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int countReplaced = 0;
        boolean isReplaced;

        do {
            isReplaced = replaceFirst(arr, numberToReplace, newNumber);
            countReplaced++;
        } while (isReplaced);

        return countReplaced - 1;
    }

    void revert(int[] arr) {
        int temp = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    void sort(int[] arr) {
        int temp = 0;
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;

                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        if (!sorted) {
            sort(arr);
        }
    }
}
