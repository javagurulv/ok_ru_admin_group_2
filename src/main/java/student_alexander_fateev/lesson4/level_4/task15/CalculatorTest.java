package student_alexander_fateev.lesson4.level_4.task15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        calcTest.sumTest();
        calcTest.substructTest();
        calcTest.multiplicationTest();
        calcTest.divisionTest();
        calcTest.evenTest();
        calcTest.oddTest();
        calcTest.biggestTest();
        calcTest.biggestFirst();
        calcTest.biggestSecond();
        calcTest.biggestThird();
        calcTest.biggestFirstAndSecond();
        calcTest.biggestFirstAndThird();
        calcTest.biggestSecondAndThird();
    }

    void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator testCalc = new Calculator();

        int realResult = testCalc.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    void substructTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator testCalc = new Calculator();

        int realResult = testCalc.substruct(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Substruction test = OK");
        } else {
            System.out.println("Substruction test = FAIL");
        }
    }

    void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        Calculator testCalc = new Calculator();

        int realResult = testCalc.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        double expectedResult = 2;

        Calculator testCalc = new Calculator();

        double realResult = testCalc.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    void evenTest() {
        int number = 10;
        boolean expectedResult = true;

        Calculator testCalc = new Calculator();

        boolean realResult = testCalc.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    void oddTest() {
        int number = 9;
        boolean expectedResult = false;

        Calculator testCalc = new Calculator();

        boolean realResult = testCalc.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Odd test = OK");
        } else {
            System.out.println("Odd test = FAIL");
        }
    }

    void biggestTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;

        Calculator testCalc = new Calculator();

        int realResult = testCalc.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");
        }
    }

    void biggestFirst() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 3;
        int expectedResult = 10;

        Calculator testCalc = new Calculator();

        int realResult = testCalc.getBiggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test (first is biggest) = OK");
        } else {
            System.out.println("Biggest test (first is biggest) = FAIL");
        }
    }

    void biggestSecond() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 3;
        int expectedResult = 10;

        Calculator testCalc = new Calculator();

        int realResult = testCalc.getBiggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test (second is biggest) = OK");
        } else {
            System.out.println("Biggest test (second is biggest) = FAIL");
        }
    }

    void biggestThird() {
        int firstNumber = 5;
        int secondNumber = 3;
        int thirdNumber = 10;
        int expectedResult = 10;

        Calculator testCalc = new Calculator();

        int realResult = testCalc.getBiggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test (third is biggest) = OK");
        } else {
            System.out.println("Biggest test (third is biggest) = FAIL");
        }
    }

    void biggestFirstAndSecond() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 10;

        Calculator testCalc = new Calculator();

        int realResult = testCalc.getBiggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test (first and second are biggest) = OK");
        } else {
            System.out.println("Biggest test (first and second are biggest) = FAIL");
        }
    }

    void biggestFirstAndThird() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 10;

        Calculator testCalc = new Calculator();

        int realResult = testCalc.getBiggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test (first and third are biggest) = OK");
        } else {
            System.out.println("Biggest test (first and third are biggest) = FAIL");
        }
    }

    void biggestSecondAndThird() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;

        Calculator testCalc = new Calculator();

        int realResult = testCalc.getBiggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test (second and third are biggest) = OK");
        } else {
            System.out.println("Biggest test (second and third are biggest) = FAIL");
        }
    }
}

