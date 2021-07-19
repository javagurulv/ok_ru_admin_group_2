package student_alexander_fateev.lesson5.level_6.task34_35_36_37_38;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int expectedArrayLength = 7;

        ArrayUtil myArray = new ArrayUtil();
        int [] numbers = myArray.createArray(expectedArrayLength);

        if (numbers.length == expectedArrayLength) {
            System.out.println("Array length: OK");
        }
        else {
            System.out.println("Array length: FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        int expectedValue = 89;
        int [] numbers = {56, 11, -3, 89, 0};

        ArrayUtil myArray = new ArrayUtil();
        int result = myArray.findMaxNumber(numbers);

        if (result == expectedValue) {
            System.out.println("FindMaxNumber: OK");
        }
        else {
            System.out.println("FindMaxNumber: FAIL");
        }
    }

    public void shouldFindMinNumber() {
        int expectedValue = -3;
        int [] numbers = {56, 11, -3, 89, 0};

        ArrayUtil myArray = new ArrayUtil();
        int result = myArray.findMinNumber(numbers);

        if (result == expectedValue) {
            System.out.println("FindMinNumber: OK");
        }
        else {
            System.out.println("FindMinNumber: FAIL");
        }
    }
}
