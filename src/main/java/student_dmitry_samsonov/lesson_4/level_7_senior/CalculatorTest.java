package student_dmitry_samsonov.lesson_4.level_7_senior;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.test("sum", 35, 40, 75);
        calculatorTest.test("sub", 35, 15, 20);
        calculatorTest.test("mul", 5, 5, 25);
        calculatorTest.test("div", 40, 8, 5);
        calculatorTest.isEvenTest("even", 40, true);
        calculatorTest.isEvenTest("odd", 41, false);
    }
    public void test(String name, int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = -999999999;
        if (result == expectedResult) {
            System.out.println("Inconsistent test, change conditions");
            return;
        }
        switch (name) {
            case "sum": {
                result = calculator.sum(firstNumber, secondNumber);
                break;
            }
            case "sub": {
                result = calculator.sub(firstNumber, secondNumber);
                break;
            }
            case "mul": {
                result = calculator.mul(firstNumber, secondNumber);
                break;
            }
            case "div": {
                result = calculator.div(firstNumber, secondNumber);
                break;
            }
        }
        this.printTestResult(name, result == expectedResult);
    }
    public void isEvenTest(String name, int firstNumber, boolean expectedResult) {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        this.printTestResult(name, result == expectedResult);
    }
    public void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }
}