package student_alexander_fateev.lesson4.level_4.task14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Calculator {
    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int substruct(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    double division(int firstNumber, int secondNumber) {
        return (double)firstNumber / (double)secondNumber;
    }

    boolean isEven (int number) {
        return number % 2 == 0;
    }

    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        else {
            return secondNumber;
        }
    }
}
