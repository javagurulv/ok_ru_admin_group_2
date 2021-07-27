package student_ilya_schanikov.lesson_5.level_5;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] numbers = new int[arrayLength];
        return numbers;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random input = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = -2147483648;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = 2147483647;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int expectedresult = 4;
        ArrayUtil newarray = new ArrayUtil();
        int[] realresult = newarray.createArray(4);
        if (expectedresult == realresult.length) {
            System.out.println("Create array test = PASS");
        } else {
            System.out.println("Create array test = FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        int expectedresult = 2147483647;
        ArrayUtil newarray = new ArrayUtil();
        int[] realresult = newarray.createArray(10);
        newarray.fillArrayWithRandomNumbers(realresult);
        realresult[9] = 2147483647;
        if (expectedresult == newarray.findMaxNumber(realresult)) {
            System.out.println("Find max test = PASS");
        } else {
            System.out.println("Find max test = FAIL");
        }
    }

    public void shouldFindMinNumber() {
        int expectedresult = -2147483648;
        ArrayUtil newarray = new ArrayUtil();
        int[] realresult = newarray.createArray(10);
        newarray.fillArrayWithRandomNumbers(realresult);
        realresult[9] = -2147483648;
        if (expectedresult == newarray.findMinNumber(realresult)) {
            System.out.println("Find min test = PASS");
        } else {
            System.out.println("Find min test = FAIL");
        }
    }
}