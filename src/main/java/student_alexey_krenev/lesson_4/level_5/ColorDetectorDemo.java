package student_alexey_krenev.lesson_4.level_5;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ColorDetectorDemo {

    public static void main(String[] args) {
        ColorDetector checkColor = new ColorDetector();


        Scanner scanner = new Scanner( System.in );
        System.out.println("Input wave length : ");
        int inColor = scanner.nextInt();
        var color = checkColor.detector(inColor);
        System.out.println("Color is " + color);

    }
}
