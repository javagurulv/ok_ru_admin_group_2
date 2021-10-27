package student_dmitry_drozdetsky.lesson_5.level_6.Task36;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        int expectedLength = 8;

        ArrayUtil testUtil = new ArrayUtil();
        int[] myArray = testUtil.createArray(expectedLength);

        if (myArray.length == expectedLength) {
            System.out.println("Create Array: OK");
        } else System.out.println("Create Array: FAIL");
    }

    public void shouldFindMaxNumber() {
        int[] myArray = {12, 8, 45, 4};
        int expectedMaxValue = 45;
        ArrayUtil testUtil = new ArrayUtil();

        if (testUtil.findMaxNumber(myArray) == expectedMaxValue) {
            System.out.println("Find Max Number: OK");
        } else {
            System.out.println("Find Max Number: FAIL");
        }
    }
}