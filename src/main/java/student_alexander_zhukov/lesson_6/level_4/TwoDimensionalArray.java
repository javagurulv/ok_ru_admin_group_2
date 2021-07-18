package student_alexander_zhukov.lesson_6.level_4;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArray {

    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] arr = twoDimensionalArray.createArray();
        twoDimensionalArray.fillArrayWithRandomNumbers(arr);
        System.out.println("Sum of all array's numbers = " + twoDimensionalArray.sumArrayNumbers(arr));
    }

    public int[][] createArray() {
        return new int[3][5];
    }

    public void fillArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

    }

    public int sumArrayNumbers(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }
}
