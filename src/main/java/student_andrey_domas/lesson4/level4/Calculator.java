package student_andrey_domas.lesson4.level4;

import teacher.codereview.CodeReview;

/**
 * See unit tests.
 */
@CodeReview(approved = true)
class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber)
            return firstNumber;
        else
            return secondNumber;
    }

    public int getMaxOfArray(int[] numbers) {
        int n = Integer.MIN_VALUE;
        for(int i: numbers)
            if (i > n)
                n = i;
        return n;
    }

}
