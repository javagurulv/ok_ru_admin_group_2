package student_alexander_fateev.lesson7.level_7.task32;

class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();
        test.additionTest();
        test.subtractionTest();
        test.multiplicationTest();
        test.divisionTest();
        
    }
    
    void additionTest() {
        double expectedResult = 15;
        String message = "Addition test";

        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(10);

        MathOperation operation = new Addition(arg1, arg2);
        printMessage(message, operation, expectedResult);
    }
    
    void subtractionTest() {
        double expectedResult = 10;
        String message = "Subtraction test";

        Argument arg1 = new Argument(15);
        Argument arg2 = new Argument(5);

        MathOperation operation = new Subtraction(arg1, arg2);
        printMessage(message, operation, expectedResult);
    }
    
    void multiplicationTest() {
        double expectedResult = 50;
        String message = "Multiplication test";

        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);

        MathOperation operation = new Multiplication(arg1, arg2);
        printMessage(message, operation, expectedResult);
    }

    void divisionTest() {
        double expectedResult = 5;
        String message = "Division test";

        Argument arg1 = new Argument(50);
        Argument arg2 = new Argument(10);

        MathOperation operation = new Division(arg1, arg2);
        printMessage(message, operation, expectedResult);
    }

    void printMessage (String message, MathOperation operation, double expectedResult) {
        if (operation.calculate() == expectedResult) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }
}
