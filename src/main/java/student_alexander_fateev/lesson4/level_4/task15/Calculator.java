package student_alexander_fateev.lesson4.level_4.task15;

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

    int getBiggest (int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            return firstNumber;
        }
        else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            return secondNumber;
        }
        else if ((firstNumber == secondNumber) && (firstNumber > thirdNumber)) {
            return firstNumber;
        }
        else {
            return thirdNumber;
        }
    }
}
