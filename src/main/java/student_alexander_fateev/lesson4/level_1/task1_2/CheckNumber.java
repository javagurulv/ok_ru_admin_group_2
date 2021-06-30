package student_alexander_fateev.lesson4.level_1.task1_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class CheckNumber {
    private int number;

    CheckNumber(int number) {
        this.number = number;
    }

    @CodeReviewComment(teacher = "Название метода не соответствует тому что делает метод.")
    boolean isPositive () {
        return number > 0;
    }

    boolean isZero () {
        return number == 0;
    }
}
