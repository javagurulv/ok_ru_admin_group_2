package student_sergo_kurbanov.lesson_5.level_5;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
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
}
