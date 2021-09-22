package student_alexey_krenev.lesson_5.level_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int length = 13;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = arrayUtil.createArray(13);
        if (arr.length == length) {
            System.out.println("Test SUCCESS");
        } else {
            System.out.println("Test ERROR");
        }
    }
}