package student_artem_aleksandrov.lesson5.level5;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();

        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public static void shouldCreateArray() {
        int[] array = new ArrayUtil().createArray(10);

        if (array.length != 10) {
            System.out.println("Test Failed");
        } else {
            System.out.println("Test OK");
        }
    }

    public void shouldFindMaxNumber() {

        ArrayUtil Array = new ArrayUtil();

        int[] array = Array.createArray(10);
        Array.fillArrayWithRandomNumbers(array);

        int max = Arrays.stream(array).max().getAsInt();

        if (Array.findMaxNumber(array) == max) {
            System.out.println("Test OK");
        } else {
            System.out.println("Failed: %s != %s".formatted(Array.findMaxNumber(array), max));
        }
    }

}
