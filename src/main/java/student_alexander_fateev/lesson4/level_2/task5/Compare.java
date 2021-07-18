package student_alexander_fateev.lesson4.level_2.task5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Compare {
    int firstNumber, secondNumber;

    Compare (int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @CodeReviewComment(teacher = "One line: return firstNumber > secondNumber ? firstNumber : secondNumber;")
    int getBigger () {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        else {
            return secondNumber;
        }
    }
}
