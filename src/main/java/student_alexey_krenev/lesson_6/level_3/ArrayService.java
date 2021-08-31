package student_alexey_krenev.lesson_6.level_3;

public class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch){
        int counter = 0;
        for (int num: arr) {
            if(num == numberToSearch){
                counter++;
            }
        }
        return counter;
    }

}
