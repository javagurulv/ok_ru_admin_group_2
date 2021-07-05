package student_dmitry_samsonov.lesson_5.level_6_middle;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] arr = new int[arrayLength];
        return arr;
    }
    public void printArrayToConsole(int[] array) {
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
    public int findMaxNumber(int[] array){
        int max = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}