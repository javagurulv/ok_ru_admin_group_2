package student_alexander_fateev.lesson4.level_3.task8;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Compare {
    int firstNumber, secondNumber, thirdNumber;

    Compare (int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    boolean allEqual () {
        return (firstNumber == secondNumber) && (firstNumber == thirdNumber);
    }

    boolean allDifferent () {
        return (firstNumber != secondNumber) && (secondNumber != thirdNumber);
    }
}
