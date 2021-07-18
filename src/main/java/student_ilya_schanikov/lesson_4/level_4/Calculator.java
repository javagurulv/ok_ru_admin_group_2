package student_ilya_schanikov.lesson_4.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double div(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int firstNumber) {
        if ((firstNumber % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int greatNumber(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            return firstNumber;
        } else if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber) {
            if (firstNumber >= thirdNumber) {
                return firstNumber;
            } else {
                return thirdNumber;
            }
        } else if (secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        calcTest.sumTest();
        calcTest.subTest();
        calcTest.multTest();
        calcTest.divTest();
        calcTest.isEvenTest();
        calcTest.greatNumberFirstTest();
        calcTest.greatNumberSecondTest();
        calcTest.greatNumberSameTest();
        calcTest.maxNumber1Test();
        calcTest.maxNumber2Test();
        calcTest.maxNumber3Test();
        calcTest.maxNumber4Test();
        calcTest.maxNumber5Test();
        calcTest.maxNumber6Test();
        calcTest.maxNumber7Test();
        calcTest.maxNumber8Test();
        calcTest.maxNumber9Test();
        calcTest.maxNumber10Test();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = PASS");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = PASS");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mult test = PASS");
        } else {
            System.out.println("Mult test = FAIL");
        }
    }

    public void divTest() {
        double firstNumber = 12;
        double secondNumber = 5;
        double expectedResult = 2.4;
        Calculator calculator = new Calculator();
        double realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = PASS");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest() {
        int firstNumber = 13;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("Even test = PASS");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    public void greatNumberFirstTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.greatNumber(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Great first test = PASS");
        } else {
            System.out.println("Great first test = FAIL");
        }
    }

    public void greatNumberSecondTest() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.greatNumber(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Great second test = PASS");
        } else {
            System.out.println("Great second test = FAIL");
        }
    }

    public void greatNumberSameTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.greatNumber(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Great same test = PASS");
        } else {
            System.out.println("Great same test = FAIL");
        }
    }

    public void maxNumber1Test() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max Number test 1 = PASS");
        } else {
            System.out.println("Max Number test 1 = FAIL");
        }
    }

    public void maxNumber2Test() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 2;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max Number test 2 = PASS");
        } else {
            System.out.println("Max Number test 2 = FAIL");
        }
    }

    public void maxNumber3Test() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max Number test 3 = PASS");
        } else {
            System.out.println("Max Number test 3 = FAIL");
        }
    }

    public void maxNumber4Test() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max Number test 4 = PASS");
        } else {
            System.out.println("Max Number test 4 = FAIL");
        }
    }

    public void maxNumber5Test() {
        int firstNumber = 3;
        int secondNumber = 1;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max Number test 5 = PASS");
        } else {
            System.out.println("Max Number test 5 = FAIL");
        }
    }

    public void maxNumber6Test() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max Number test 6 = PASS");
        } else {
            System.out.println("Max Number test 6 = FAIL");
        }
    }

    public void maxNumber7Test() {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max Number test 7 = PASS");
        } else {
            System.out.println("Max Number test 7 = FAIL");
        }
    }

    public void maxNumber8Test() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max Number test 8 = PASS");
        } else {
            System.out.println("Max Number test 8 = FAIL");
        }
    }

    public void maxNumber9Test() {
        int firstNumber = 3;
        int secondNumber = 1;
        int thirdNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max Number test 9 = PASS");
        } else {
            System.out.println("Max Number test 9 = FAIL");
        }
    }

    public void maxNumber10Test() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max Number test 10 = PASS");
        } else {
            System.out.println("Max Number test 10 = FAIL");
        }
    }
}


