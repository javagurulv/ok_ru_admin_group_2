package student_andrey_domas.lesson5.level5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldBeDifferent();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil au = new ArrayUtil();

        System.out.print("Test length: ");
        for (int i = 0; i < 10; i++) {
            var arr = au.createArray(i);
            if (arr.length != i) {
                System.out.println("FAIL");
                break;
            }
        }
        System.out.println("OK");
    }

    public void shouldBeDifferent() {
        ArrayUtil au = new ArrayUtil();
        var arr = au.createArray(100);
        au.fillArrayWithRandomNumbers(arr);

        var arrSet = new HashSet<Integer>();
        for(int i: arr) {
            arrSet.add(i);
        }
        var test = arrSet.size() > 1;
        System.out.println("Test random: " + (test ? "OK": "FAIL"));
    }

    public void shouldFindMaxNumber() {
        ArrayUtil au = new ArrayUtil();
        final int CNT = 50;
        var arr = au.createArray(CNT);
        for (int i = 0; i < CNT; i++) {
            arr[i] = i;
        }

        System.out.print("Test max: ");

        for (int i = 0; i < CNT; i++) {
            // make i-element maximal
            var maximal = CNT + i;
            arr[i] = maximal;
            if (au.findMaxNumber(arr) != maximal) {
                System.out.println("FAIL");
                return;
            }
        }
        System.out.println("OK");
    }

    public void shouldFindMinNumber() {
        ArrayUtil au = new ArrayUtil();
        final int CNT = 50;
        var arr = au.createArray(CNT);
        for (int i = 0; i < CNT; i++) {
            arr[i] = i;
        }

        System.out.print("Test min: ");

        for (int i = 0; i < CNT; i++) {
            // make i-element minimal
            var minimal = arr[i] * -1;
            arr[i] = minimal;
            if (au.findMinNumber(arr) != minimal) {
                System.out.println("FAIL");
                return;
            }
        }
        System.out.println("OK");
    }

}