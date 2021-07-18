package student_andrey_tryapichnikov.lesson_5.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {
    ArrayUtil arrayUtil = new ArrayUtil();
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.testRandom();
    }

    public void testRandom() {
        var numbers = arrayUtil.createArray(12);
        for (int i: numbers) System.out.println(i);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        for (int i: numbers) System.out.println(i);
    }

    public void shouldCreateArray() {
        if (arrayUtil.createArray(12).length == 12) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

}
