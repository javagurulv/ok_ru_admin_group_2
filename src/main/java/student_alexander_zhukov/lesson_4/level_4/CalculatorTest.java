package student_alexander_zhukov.lesson_4.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
        calculatorTest.maxTest(8,3,8, 1);
        calculatorTest.maxTest(9,31,31, 2);
        calculatorTest.maxTest(17,17,17, 3);
        calculatorTest.max3Test(17,1,5, 17, 1);
        calculatorTest.max3Test(0,99,45, 99, 2);
        calculatorTest.max3Test(11,77,78, 78, 3);
        calculatorTest.max3Test(15,15,3, 15, 4);
        calculatorTest.max3Test(171,171,171, 171, 5);

    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        boolean res = result == 75;
        testResult(res, "Sum");

    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        boolean res = result == 20;
        testResult(res, "Sub");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        boolean res = result == 25;
        testResult(res, "Mul");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        boolean res = result == 5;
        testResult(res, "Div");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);
        testResult(result, "isEven");
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(41);
        testResult(!result, "isEven");
    }

    public void maxTest(int firstNumber, int secondNumber, int rightResult, int numTest) {
        Calculator calculator = new Calculator();
        int result = calculator.max(firstNumber, secondNumber);
        testResult(result == rightResult, "Max_" + numTest);
    }

    public void max3Test(int firstNumber, int secondNumber, int thirdNumber, int rightResult, int numTest) {
        Calculator calculator = new Calculator();
        int result = calculator.max3(firstNumber, secondNumber, thirdNumber);
        testResult(result == rightResult, "Max3_" + numTest);
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
