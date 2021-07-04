package student_sergo_kurbanov.lesson_4.level_7;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest("Sum", 10, 5, 15);
        calculatorTest.subTest("Sub", 15, 10, 5);
        calculatorTest.multTest("Mult", 10, 5, 50);
        calculatorTest.divTest("Div", 50, 10, 5);
        calculatorTest.evenTest();
        calculatorTest.maxTestLe();
        calculatorTest.maxTestGt();
        calculatorTest.maxTestEq();
        calculatorTest.maxOfThreeNumbers1();
        calculatorTest.maxOfThreeNumbers2();
        calculatorTest.maxOfThreeNumbers3();
        calculatorTest.maxOfThreeNumbers4();
    }

    public void sumTest(String testName, int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать

        printTestResult(testName, expectedResult, realResult); // проверяем правильно ли сработал тестируемый код
    }

    public void subTest(String testName, int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать

        printTestResult(testName, expectedResult, realResult); // проверяем правильно ли сработал тестируемый код
    }

    public void multTest(String testName, int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать

        printTestResult(testName, expectedResult, realResult); // проверяем правильно ли сработал тестируемый код
    }

    public void divTest(String testName, int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать

        printTestResult(testName, expectedResult, realResult); // проверяем правильно ли сработал тестируемый код
    }

    public void evenTest() {
        int firstNumber = 50;  // подготавливаем тестовые данные
        boolean expectedResult = true;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);  // вызываем продакшен код, который хотим протестировать
        checkResults("Even", expectedResult, realResult);
    }

    private void checkResults(String testNane, boolean expectedResult, boolean realResult) {
        System.out.println();
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Even test = OK");
        } else {
            System.out.println(testNane + " test = FAIL");
        }
    }

    public void maxTestLe() {
        int firstNumber = 5;  // подготавливаем тестовые данные
        int secondNumber = 10;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxTestLe test = OK");
        } else {
            System.out.println("maxTestLe test = FAIL");
        }
    }

    public void maxTestGt() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxTestGt test = OK");
        } else {
            System.out.println("maxTestGt test = FAIL");
        }
    }

    public void maxTestEq() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 10;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxTestEq test = OK");
        } else {
            System.out.println("maxTestEq test = FAIL");
        }
    }

    // thirst is max
    public void maxOfThreeNumbers1() {
        int firstNumber = 100;  // подготавливаем тестовые данные
        int secondNumber = 20;  // подготавливаем тестовые данные
        int thirdNumber = 30;  // подготавливаем тестовые данные
        int expectedResult = 100;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfThreeNumbers1 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers1 test = FAIL");
        }
    }

    // second is max
    public void maxOfThreeNumbers2() {
        int firstNumber = 20;  // подготавливаем тестовые данные
        int secondNumber = 100;  // подготавливаем тестовые данные
        int thirdNumber = 30;  // подготавливаем тестовые данные
        int expectedResult = 100;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfThreeNumbers2 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers2 test = FAIL");
        }
    }

    // third is max
    public void maxOfThreeNumbers3() {
        int firstNumber = 20;  // подготавливаем тестовые данные
        int secondNumber = 30;  // подготавливаем тестовые данные
        int thirdNumber = 100;  // подготавливаем тестовые данные
        int expectedResult = 100;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfThreeNumbers3 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers3 test = FAIL");
        }
    }

    // all equal
    public void maxOfThreeNumbers4() {
        int firstNumber = 20;  // подготавливаем тестовые данные
        int secondNumber = 20;  // подготавливаем тестовые данные
        int thirdNumber = 20;  // подготавливаем тестовые данные
        int expectedResult = 20;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfThreeNumbers4 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers4 test = FAIL");
        }
    }

    private void printTestResult(String testName, int expectedResult, int realResult) {
        System.out.printf("\n%s test = %s", testName, realResult == expectedResult ? "OK" : "FAIL");
    }
}

