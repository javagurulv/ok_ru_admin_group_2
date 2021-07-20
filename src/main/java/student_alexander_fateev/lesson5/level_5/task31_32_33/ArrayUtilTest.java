package student_alexander_fateev.lesson5.level_5.task31_32_33;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
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

}
