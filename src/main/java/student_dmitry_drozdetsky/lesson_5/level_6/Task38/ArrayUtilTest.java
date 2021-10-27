package student_dmitry_drozdetsky.lesson_5.level_6.Task38;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
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
        int length = 4;
        ArrayUtil testUtil = new ArrayUtil();
        int[] myArray = testUtil.createArray(length);
        myArray[0] = 12;
        myArray[1] = 8;
        myArray[2] = 45;
        myArray[3] = 4;
        int expectedMaxValue = 45;

        if (testUtil.findMaxNumber(myArray) == expectedMaxValue) {
            System.out.println("Find Max Number: OK");
        } else System.out.println("Find Max Number: FAIL");
    }
    public void shouldFindMinNumber() {
        int length = 4;
        ArrayUtil testUtil = new ArrayUtil();
        int[] myArray = testUtil.createArray(length);
        myArray[0] = 12;
        myArray[1] = 8;
        myArray[2] = 45;
        myArray[3] = 4;
        int expectedMinValue = 4;

        if (testUtil.findMinNumber(myArray) == expectedMinValue) {
            System.out.println("Find Min Number: OK");
       } else System.out.println("Find Min Number: FAIL");
    }
  }
