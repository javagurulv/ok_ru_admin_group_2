package student_alexander_zhukov.lesson_5.level_4;

import java.util.Random;

class RandomArray1 {

    public static void main(String[] args) {

        Random random = new Random();
        int arrayLength = random.nextInt(10) + 1;

        int[] userArr = new int[arrayLength];
        for (int i = 0; i < userArr.length; i++) {
            userArr[i] = random.nextInt(100);
        }
        int minNum =  userArr[0];

        for (int j = 0; j < userArr.length; j++) {
            System.out.println(userArr[j]);
            if (userArr[j] <= minNum) {
                minNum = userArr[j];
            }
        }

        System.out.println("Minimum: " + minNum);
    }
}
