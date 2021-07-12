package student_alexander_zhukov.lesson_6.level_3;

class ArrayService {

    public boolean contains(int[] arr, int numberToSearch) {
        for (int i:arr) {
            if (numberToSearch == i) {
                return true;
            }
        }
        return false;
    }

    public int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int i:arr) {
            if (numberToSearch == i) {
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

    public int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count++;
            }
        }
        return count;
    }

    public void revert(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length/2; i++) {
           tmp = arr[i];
           arr[i] = arr[arr.length - 1 - i];
           arr[arr.length - 1 - i] = tmp;
        }
    }

    void sort(int[] arr) {
        boolean sorted = false;
        int tmp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    tmp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                    sorted = false;
                }
            }
        }
    }

}
