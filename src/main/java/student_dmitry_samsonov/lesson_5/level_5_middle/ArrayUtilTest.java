package student_dmitry_samsonov.lesson_5.level_5_middle;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int length = 5;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = arrayUtil.createArray(5);
        if (arr.length == length) {
            System.out.println("Test array lenght = OK");
        } else {
            System.out.println("Test array lenght = FAIL");
        }
    }
}