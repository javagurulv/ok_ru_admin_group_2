package student_alexander_zhukov.lesson_5.level_4;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RandomArray2 {

    public static void main(String[] args) {

        Random random = new Random();
        int arrayLength = random.nextInt(10) + 1;

        int[] userArr = new int[arrayLength];
        for (int i = 0; i < userArr.length; i++) {
            userArr[i] = random.nextInt(100);
            System.out.println(userArr[i]);
        }

        System.out.println("Even numbers: ");

        for (int j = 0; j < userArr.length; j++) {
            if (userArr[j] % 2 == 0) {
                System.out.println(userArr[j]);
            }
        }

    }
}
