package student_artem_aleksandrov.lesson4.level4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.SumTest();
        calculatorTest.DivideTest();
        calculatorTest.IfEvenTest();
    }

    public void TestOK() {
        System.out.println("OK");
    }

    public void TestFailed() {
        System.out.println("Test Failed");
    }

    public void SumTest() {
        int first = 2;
        int second = 5;
        int result = first + second;

        Calculator calculator = new Calculator();

        if (calculator.sum(first, second) == result) {
            TestOK();
        } else {
            TestFailed();
        }
    }

    public void DivideTest() {
        int first = 10;
        int second = 2;
        int result = 5;

        Calculator calculator = new Calculator();

        if (calculator.divide(first, second) == result) {
            this.TestOK();
        } else {
            this.TestFailed();
        }
    }

    public void IfEvenTest() {
        int number = 2;

        Calculator calculator = new Calculator();

        if (calculator.isEven(number)) {
            TestOK();
        } else {
            TestFailed();
        }
    }
}