package student_alexander_zhukov.lesson_5.level_6;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil testArr = new ArrayUtil();
        int[] arr1 = testArr.createArray(10);
        checkResults(arr1.length == 10, "CreateArray");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil testArr1 = new ArrayUtil();
        int[] testArrMax = new int[] {5, 6, 1, 99};
        checkResults(testArr1.findMaxNumber(testArrMax) == 99, "FindMaxNumber");
    }

    public void shouldFindMinNumber() {
        ArrayUtil testArr2 = new ArrayUtil();
        int[] testArrMin = new int[] {3, 186, 1, 99};
        checkResults(testArr2.findMinNumber(testArrMin) == 1, "FindMinNumber");
    }

    public void checkResults(boolean result, String name) {
        if (result) {
            System.out.println("Test " + name + " - OK");
        }
        else {
            System.out.println("Test " + name + " - FAIL");
        }
    }

}
