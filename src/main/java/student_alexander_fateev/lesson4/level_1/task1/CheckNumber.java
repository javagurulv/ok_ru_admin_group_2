package student_alexander_fateev.lesson4.level_1.task1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class CheckNumber {
    private int number;

    CheckNumber(int number) {
        this.number = number;
    }

    @CodeReviewComment(teacher = "Название метода не соответствует тому что делает метод.")
    void isPositive() {
        if (this.number < 0) {
            System.out.println(this.number + " is negative");
        }
        else if (this.number > 0) {
            System.out.println(this.number + " is positive");
        }
        else {
            System.out.println("zero");
        }
    }
}
