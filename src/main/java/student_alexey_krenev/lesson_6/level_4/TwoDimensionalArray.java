package student_alexey_krenev.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] array = initAndFillArray();

        System.out.println("sum " + summaryArrayElements(array));

    }


    static int[][] initAndFillArray(){
        int[][] array = new int[2][2];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt();
                //System.out.println("element " + array[i][j]); // for debug
            }
        }
        return array;
    }


    static int summaryArrayElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

}
