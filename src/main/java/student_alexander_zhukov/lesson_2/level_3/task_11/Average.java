package student_alexander_zhukov.lesson_2.level_3.task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Average {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        double sumRes = 0;

        System.out.println("Input three integers numbers:");
        for (int i = 1; i < 4; i++) {
            System.out.println("Input " + i + ":");
            sumRes = sumRes + myInput.nextInt();
        }

        System.out.println("Average is :" + sumRes/3);
    }
}
