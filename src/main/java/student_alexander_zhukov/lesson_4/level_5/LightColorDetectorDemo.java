package student_alexander_zhukov.lesson_4.level_5;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorDemo {
    public static void main(String[] args) {
        LightColorDetector testColor = new LightColorDetector();

        Scanner myInput = new Scanner( System.in );
        System.out.println("Input wave length (int): ");
        int myColor = myInput.nextInt();
        var color = testColor.detect(myColor);
        System.out.println(color);

    }
}
