package student_andrey_tryapichnikov.lesson_4.level_1;

import student_andrey_tryapichnikov.boilerplate.BoilerplateStatic;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RelToZeroDemo {
    static String status(int number) {
        if (RelToZero.isPositive(number)) return "positive";
        if (RelToZero.isNegative(number)) return "negative";
        return "zero";
    }

    public static void main(String[] args) {
        var value = BoilerplateStatic.queryNumberDefault(1)[0];

        var status = status(value);
        System.out.printf("The number %s is %s!\n", value, status);
    }
}
