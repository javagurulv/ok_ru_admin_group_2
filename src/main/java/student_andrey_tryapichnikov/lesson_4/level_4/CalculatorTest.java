package student_andrey_tryapichnikov.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        var tests = new CalculatorTest();
        tests.testSum(15, 42, 57);
        tests.testSum(42, 15, 3);
        tests.testSub(350, 11, 339);
        tests.testSub(221, 3, 500);
        tests.testMul(13, 0, 0);
        tests.testMul(8, 5, 1);
        tests.testDiv(512, 2, 256);
        tests.testDiv(11, 4, 0);
        tests.testEven(15, false);
        tests.testEven(2000, true);
        tests.testEven(1, true);
        tests.testEven(-20, false);
        tests.testMaxTwo(42, 142, 142);
        tests.testMaxTwo(15, 15, 15);
        tests.testMaxTwo(141, 41, 141);
        tests.testMaxThree(1, 2, 3, 3);
        tests.testMaxThree(1, 1, 3, 3);
        tests.testMaxThree(1, 1, 1, 1);
        tests.testMaxThree(1, 3, 2, 3);
        tests.testMaxThree(1, 3, 3, 3);
        tests.testMaxThree(3, 2, 3, 3);
        tests.testMaxThree(3, 2, 1, 3);
    }

    void report(boolean result, String operationName) {
        String testResult = result ? "OK" : "FAIL";
        System.out.printf("%s test: %s\n", operationName, testResult);
    }

    void testSum(int numeroUno, int numeroDos, int expectedResult) {
        var opResult = Calculator.sum(numeroUno, numeroDos);
        var testResult = opResult == expectedResult;
        report(testResult, "Sum");
    }

    void testSub(int numeroUno, int numeroDos, int expectedResult) {
        var opResult = Calculator.sub(numeroUno, numeroDos);
        var testResult = opResult == expectedResult;
        report(testResult, "Subtraction");
    }

    void testMul(int numeroUno, int numeroDos, int expectedResult) {
        var opResult = Calculator.mul(numeroUno, numeroDos);
        var testResult = opResult == expectedResult;
        report(testResult, "Multiplication");
    }

    void testDiv(int numeroUno, int numeroDos, int expectedResult) {
        var opResult = Calculator.div(numeroUno, numeroDos);
        var testResult = opResult == expectedResult;
        report(testResult, "Division");
    }

    void testEven(int numero, boolean expectedEven) {
        var opResult = Calculator.isEven(numero);
        var testResult = opResult == expectedEven;
        report(testResult, "Even");
    }

    void testMaxTwo(int numeroUno, int numeroDos, int expectedResult) {
        var opResult = Calculator.maxOfTwoNumbers(numeroUno, numeroDos);
        var testResult = opResult == expectedResult;
        report(testResult, "Max of two");
    }

    void testMaxThree(int numeroUno, int numeroDos, int numeroTres, int expectedResult) {
        var opResult = Calculator.maxOfThreeNumbers(numeroUno, numeroDos, numeroTres);
        var testResult = opResult == expectedResult;
        report(testResult, "Max of three");
    }
}
