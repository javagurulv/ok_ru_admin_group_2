package student_alexander_fateev.lesson4.level_2.task7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Compare {
    int firstNumber, secondNumber;

    Compare (int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    boolean isEqual () {
        return firstNumber == secondNumber;
    }
}
