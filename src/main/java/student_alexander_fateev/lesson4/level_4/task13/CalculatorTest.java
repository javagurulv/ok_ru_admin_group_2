package student_alexander_fateev.lesson4.level_4.task13;

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
}
