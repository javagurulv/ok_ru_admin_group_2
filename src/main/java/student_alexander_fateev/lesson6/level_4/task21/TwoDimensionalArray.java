package student_alexander_fateev.lesson6.level_4.task21;

import java.util.Random;

class TwoDimensionalArray {
    int [][] create2dArray() {
        int[][] array = new int[4][5];
        fill2dArray(array);

        return array;
    }

    private void fill2dArray(int [][] array) {
        Random random = new Random();
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }

    int calculateSumOfElements(int [][] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
