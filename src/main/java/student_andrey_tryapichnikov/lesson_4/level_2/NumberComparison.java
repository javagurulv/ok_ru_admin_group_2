package student_andrey_tryapichnikov.lesson_4.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class NumberComparison {
    static int getLargest(int number1, int number2) {
        if (number1 > number2) return number1;
        else return number2;
    }

    static int getSmallest(int number1, int number2) {
        if (number1 < number2) return number1;
        else return number2;
    }

    static boolean numbersEqual(int number1, int number2) {
        return number1 == number2;
    }
}
