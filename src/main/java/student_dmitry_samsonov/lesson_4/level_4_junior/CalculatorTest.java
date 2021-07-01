package student_dmitry_samsonov.lesson_4.level_4_junior;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbers1Test();
        calculatorTest.maxOfTwoNumbers2Test();
        calculatorTest.maxOfTwoNumbers3Test();
        calculatorTest.biggest1Test();
        calculatorTest.biggest2Test();
        calculatorTest.biggest3Test();
        calculatorTest.biggest4Test();
        calculatorTest.biggest5Test();
        calculatorTest.biggest6Test();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }
    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }
    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }
    public void isEvenTest() {
        int firstNumber = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }
    public void maxOfTwoNumbers1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max test first is bigger = OK");
        } else {
            System.out.println("Max test first is bigger = FAIL");
        }
    }
    public void maxOfTwoNumbers2Test() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max test second is bigger = OK");
        } else {
            System.out.println("Max test second is bigger = FAIL");
        }
    }
    public void maxOfTwoNumbers3Test() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max test both are equal = OK");
        } else {
            System.out.println("Max test both are equal = FAIL");
        }
    }
    public void biggest1Test() {
        int firstNumber = 20;
        int secondNumber = 10;
        int thirdNumber = 7;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test first is bigger = OK");
        } else {
            System.out.println("Biggest test both first is bigger = FAIL");
        }
    }
    public void biggest2Test() {
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 7;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test second is bigger = OK");
        } else {
            System.out.println("Biggest test both second is bigger = FAIL");
        }
    }
    public void biggest3Test() {
        int firstNumber = 10;
        int secondNumber = 7;
        int thirdNumber = 20;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test third is bigger = OK");
        } else {
            System.out.println("Biggest test both third is bigger = FAIL");
        }
    }
    public void biggest4Test() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 7;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test first two are bigger = OK");
        } else {
            System.out.println("Biggest test both first two are bigger = FAIL");
        }
    }
    public void biggest5Test() {
        int firstNumber = 7;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test second two are bigger = OK");
        } else {
            System.out.println("Biggest test both second two are bigger = FAIL");
        }
    }
    public void biggest6Test() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggest(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Biggest test all are equal = OK");
        } else {
            System.out.println("Biggest test all are equal = FAIL");
        }
    }
}