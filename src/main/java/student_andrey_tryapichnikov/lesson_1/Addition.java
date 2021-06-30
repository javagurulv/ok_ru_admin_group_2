package student_andrey_tryapichnikov.lesson_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Addition {
    public static double add(double[] values) {
        double result = 0;
        for (double aDouble : values) result += aDouble;
        return result;
    }

    public static void main(String[] args) {
        double[] values = new double[]{100, 40, 2};
        System.out.println(add(values));
    }
}
