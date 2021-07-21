package student_alexander_fateev.lesson6.level_1.task6;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.evenTest();
        test.oddTest();
    }

    public void evenTest() {
        boolean expectedValue = true;

        NumberUtils testNumber = new NumberUtils();
        boolean result = testNumber.isEven(4);
        if (result == expectedValue) {
            System.out.println("4 is even: OK");
        }
        else {
            System.out.println("4 is even: FAIL");
        }
    }

    public void oddTest() {
        boolean expectedValue = false;

        NumberUtils testNumber = new NumberUtils();
        boolean result = testNumber.isEven(3);
        if (result == expectedValue) {
            System.out.println("3 is odd: OK");
        }
        else {
            System.out.println("3 is odd: FAIL");
        }
    }
}
