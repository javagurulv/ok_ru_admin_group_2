package student_alexander_zhukov.lesson_5.level_4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserArray1 {
    public static void main(String[] args) {

        Scanner myInput = new Scanner( System.in );
        System.out.println("Input array length (int):");
        int arrayLength = myInput.nextInt();

        int[] userArr = new int[arrayLength];
        for (int i = 0; i < userArr.length; i++) {
            System.out.println("Input element with position " + i);
            userArr[i] = myInput.nextInt();
        }
        for (int j = 0; j < userArr.length; j++) {
            System.out.println(userArr[j]);
        }
    }


}
