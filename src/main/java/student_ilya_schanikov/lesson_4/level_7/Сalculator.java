package student_ilya_schanikov.lesson_4.level_7;

class Calculator {
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
}


class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        calcTest.Test("sum", 35, 40, 75);
        calcTest.Test("sub", 35, 15, 20);
        calcTest.Test("mult", 5, 5, 25);
        calcTest.Test("div", 40, 8, 5);
        calcTest.Test("isEvenTest1", 40, true);
        calcTest.Test("isEvenTest1", 41, false);
    }

    public void Test(String TestName, int firstNum, int secondNum, int expectedRes) {
        Calculator calculator = new Calculator();
        int outcome = 0;
        switch (TestName) {
            case "sum": {
                outcome = calculator.sum(firstNum, secondNum);
                break;
            }
            case "sub": {
                outcome = calculator.sub(firstNum, secondNum);
                break;
            }
            case "mult": {
                outcome = calculator.mul(firstNum, secondNum);
                break;
            }
            case "div": {
                outcome = calculator.div(firstNum, secondNum);
                break;
            }
            default: {
                System.out.println("Unknown test name");
                break;
            }
        }
        printTestResult(TestName, outcome == expectedRes);
    }

    public void Test(String TestName, int firstNum, boolean expectedRes) {
        Calculator calculator = new Calculator();
        boolean outcome = true;
        switch (TestName) {
            case "isEvenTest1": {
                outcome = calculator.isEven(firstNum);
                break;
            }
            case "isEvenTest2": {
                outcome = calculator.isEven(firstNum);
                break;
            }
            default: {
                System.out.println("Unknown test name");
                break;
            }
        }
        printTestResult(TestName, outcome == expectedRes);
    }

    public void printTestResult(String testN, boolean testResult) {
        if (testResult) {
            String convertedResult = "OK";
            System.out.println("Test " + testN + " result is: " + convertedResult);
        } else {
            String convertedResult = "FAIL";
            System.out.println("Test " + testN + " result is: " + convertedResult);
        }
    }
}
