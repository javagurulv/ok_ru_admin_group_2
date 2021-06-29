package student_sergo_kurbanov.lesson_4.level_4;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return ((number % 2) == 0);
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        return secondNumber;
        // TODO if equal?
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int Max = firstNumber;
        if (secondNumber > Max) {
            Max = secondNumber;
        }
        if (thirdNumber > Max) {
            Max = thirdNumber;
        }

        // TODO some or all numbers could be equal:
        //  in that case it wouldn't be correct answer
        return Max;
    }
}
