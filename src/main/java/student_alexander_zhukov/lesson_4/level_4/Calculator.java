package student_alexander_zhukov.lesson_4.level_4;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Calculator {

	@CodeReviewComment(teacher = "Дефолтный конструктор у класса можно не писать явно если он единственный конструктор в классе. Java при компиляции его добавит автоматически.")
    public Calculator() {
    }

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int max(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        }
        else {
            return secondNumber;
        }
    }

    public int max3(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        }
        else if (secondNumber >= thirdNumber) {
            return secondNumber;
        }
        else {
            return thirdNumber;
        }
    }
}
