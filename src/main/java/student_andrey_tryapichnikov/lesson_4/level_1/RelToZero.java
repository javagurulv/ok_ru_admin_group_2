package student_andrey_tryapichnikov.lesson_4.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RelToZero {
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static boolean isZero(int number) {
        return number == 0;
    }
}
