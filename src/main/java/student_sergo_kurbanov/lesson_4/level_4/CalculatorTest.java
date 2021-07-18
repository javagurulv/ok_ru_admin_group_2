package student_sergo_kurbanov.lesson_4.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.evenTest();
        calculatorTest.maxTestLe();
        calculatorTest.maxTestGt();
        calculatorTest.maxTestEq();
        calculatorTest.maxOfThreeNumbers1();
        calculatorTest.maxOfThreeNumbers2();
        calculatorTest.maxOfThreeNumbers3();
        calculatorTest.maxOfThreeNumbers4();
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 15;  // подготавливаем тестовые данные
        int secondNumber = 10;  // подготавливаем тестовые данные
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 50;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Mult test = OK");
        } else {
            System.out.println("Mult test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 50;  // подготавливаем тестовые данные
        int secondNumber = 10;  // подготавливаем тестовые данные
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void evenTest() {
        int firstNumber = 50;  // подготавливаем тестовые данные
        boolean expectedResult = true;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
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
}
