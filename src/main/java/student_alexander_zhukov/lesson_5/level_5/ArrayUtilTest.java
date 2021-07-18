package student_alexander_zhukov.lesson_5.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        ArrayUtil testArr = new ArrayUtil();
        int[] arr1 = testArr.createArray(10);
        if (arr1.length == 10) {
            System.out.println("Test - OK");
        }
        else {
            System.out.println("Test - FAIL");
        }

    }

}
