package student_dmitry_drozdetsky.lesson_5.level_6.Task34;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int expectedLength = 7;

        ArrayUtil testUtil = new ArrayUtil();
        int[] myArray = testUtil.createArray(expectedLength);

        if (myArray.length == expectedLength) {
            System.out.println("Create Array: OK");
        } else System.out.println("Create Array: FAIL");
    }
}
