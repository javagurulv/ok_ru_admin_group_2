package student_sergo_kurbanov.lesson_5.level_6;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int size = 10;
        int[] testArray = arrayUtil.createArray(size);
        if (testArray.length == size) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        int[] testArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int testMaxNum = 9;

        ArrayUtil arrayUtil = new ArrayUtil();
        int max = arrayUtil.findMaxNumber(testArray);

        if (max == testMaxNum) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void shouldFindMinNumber() {
        int[] testArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int testMinNum = -1;

        ArrayUtil arrayUtil = new ArrayUtil();
        int max = arrayUtil.findMinNumber(testArray);

        if (max == testMinNum) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
