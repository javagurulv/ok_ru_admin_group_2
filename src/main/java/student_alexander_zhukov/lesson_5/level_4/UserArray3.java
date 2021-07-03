package student_alexander_zhukov.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class UserArray3 {
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        System.out.println("Input array length (int):");
        int arrayLength = myInput.nextInt();

        Random random = new Random();

        int[] userArr = new int[arrayLength];
        for (int i = 0; i < userArr.length; i++) {
            userArr[i] = random.nextInt(100);
        }
        int maxNum =  userArr[0];

        for (int j = 0; j < userArr.length; j++) {
            System.out.println(userArr[j]);
            if (userArr[j] >= maxNum) {
                maxNum = userArr[j];
            }
        }

        System.out.println("Maximum: " + maxNum);
    }
}
