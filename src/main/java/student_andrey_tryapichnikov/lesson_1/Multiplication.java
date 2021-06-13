package student_andrey_tryapichnikov.lesson_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Multiplication {
    public static double multiply(double[] values) {
        int result = 1;
        for (double aDouble : values) result *= aDouble;
        return result;
    }

    public static void main(String[] args) {
        var values = new double[]{42, 15};
        System.out.println(multiply(values));
    }
}
