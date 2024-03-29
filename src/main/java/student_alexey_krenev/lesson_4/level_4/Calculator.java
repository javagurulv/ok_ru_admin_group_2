package student_alexey_krenev.lesson_4.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber*secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber/secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {

        if(firstNumber > secondNumber){
            return firstNumber;
        }
        else if(secondNumber >  firstNumber ) {
            return secondNumber;
        }
        else
         {
            return firstNumber;
        }
    }

}