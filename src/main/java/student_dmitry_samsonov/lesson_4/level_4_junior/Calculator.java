package student_dmitry_samsonov.lesson_4.level_4_junior;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int maxNumber = firstNumber;
        if (secondNumber > maxNumber) {
            maxNumber = secondNumber;
        }
        return maxNumber;
    }
    int biggest(int number1, int number2, int number3) {
        int biggest = number1;
        if (number2 > biggest){
            biggest = number2;
        }
        if (number3 > biggest) {
            biggest = number3;
        }
        return biggest;
    }
}