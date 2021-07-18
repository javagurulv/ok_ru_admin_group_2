package student_alexander_fateev.lesson4.level_3.task9;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Compare {
    int firstNumber, secondNumber, thirdNumber;

    Compare (int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    boolean isIncreasing () {
        return (firstNumber < secondNumber) && (secondNumber < thirdNumber);
    }

    boolean isDecreasing () {
        return (firstNumber > secondNumber) && (secondNumber > thirdNumber);
    }
}
