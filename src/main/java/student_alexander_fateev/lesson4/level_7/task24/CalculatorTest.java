package student_alexander_fateev.lesson4.level_7.task24;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        //calculatorTest.isEvenTest2();
    }

    public void checkResult(int expectedResult, int result, String testName) {
        if (result == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void checkEvenResult(boolean result, boolean isOdd) {
        if ((result && !isOdd) || (!result && isOdd)) {
            System.out.println("isEven test = OK");
        }
        else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        checkResult(75, result, "Sum test");
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        checkResult(20, result, "Sub test");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        checkResult(25, result, "Mul test");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        checkResult(5, result, "Div test");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);
        checkEvenResult(result, false);
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(41);
        checkEvenResult(result, true);
    }
}
