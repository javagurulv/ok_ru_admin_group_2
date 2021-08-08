package student_ilya_schanikov.lesson_5.level_7;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] numbers = new int[arrayLength];
        return numbers;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random input = new Random();
        for (int i:array) { array[i] = input.nextInt(); }
    }

    public void printArrayToConsole(int[] array) {
        for (int i:array) { System.out.println("Element " + i + ": " + array[i]); }
    }

    public int findMaxNumber(int[] array) {
        int max = -2147483648;
        for (int i:array) {
            if (i > max) { max = i; }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = 2147483647;
        for (int i:array) {
            if (i < min) { min = i; }
        }
        return min;
    }

    public int[] OddNumbers(int[] array) {
        int counter = 0;
        for (int i:array) {
            if (i % 2 != 0) { counter = counter + 1; }
        }
        ArrayUtil newarray = new ArrayUtil();
        int[] oddArray = newarray.createArray(counter);
        for (int i:array) {
            if (i % 2 != 0) {
                oddArray[counter - 1] = i;
                counter = counter - 1;
            }
        }
        return oddArray;
    }

    public int[] EvenNumbers(int[] array) {
        int counter = 0;
        for (int i:array) {
            if (i % 2 == 0) { counter = counter + 1; }
        }
        ArrayUtil newarray = new ArrayUtil();
        int[] evenArray = newarray.createArray(counter);
        for (int i:array) {
            if (i % 2 == 0) {
                evenArray[counter - 1] = i;
                counter = counter - 1;
            }
        }
        return evenArray;
    }
}

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray(4);
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.shouldCountOddNumbers();
        test.shouldCountEvenNumbers();

    }

    public void shouldCreateArray(int size) {
        int expectedresult = size;
        ArrayUtil newarray = new ArrayUtil();
        int[] realresult = newarray.createArray(size);
        this.printTestResult( "CreatingArray", expectedresult == realresult.length);
    }

    public void shouldFindMaxNumber() {
        int expectedresult = 2147483647;
        ArrayUtil newarray = new ArrayUtil();
        int[] realresult = newarray.createArray(10);
        newarray.fillArrayWithRandomNumbers(realresult);
        realresult[9] = 2147483647;
        this.printTestResult( "MaxNumber", expectedresult == newarray.findMaxNumber(realresult));
    }

    public void shouldFindMinNumber() {
        int expectedresult = -2147483648;
        ArrayUtil newarray = new ArrayUtil();
        int[] realresult = newarray.createArray(10);
        newarray.fillArrayWithRandomNumbers(realresult);
        realresult[9] = -2147483648;
        this.printTestResult( "MinNumber", expectedresult == newarray.findMinNumber(realresult));
    }

    public void shouldCountOddNumbers() {
        int expectedresult = 2;
        ArrayUtil newarray = new ArrayUtil();
        int[] realresult = newarray.createArray(5);
        realresult[0] = 10;
        realresult[1] = 11;
        realresult[2] = 12;
        realresult[3] = 13;
        realresult[4] = 14;
        this.printTestResult( "OddNumbers", expectedresult == newarray.OddNumbers(realresult).length);
    }

    public void shouldCountEvenNumbers() {
        int expectedresult = 3;
        ArrayUtil newarray = new ArrayUtil();
        int[] realresult = newarray.createArray(5);
        realresult[0] = 10;
        realresult[1] = 11;
        realresult[2] = 12;
        realresult[3] = 13;
        realresult[4] = 14;
        this.printTestResult( "EvenNumbers", expectedresult == newarray.EvenNumbers(realresult).length);
    }

    public void printTestResult(String testN, boolean testResult) {
        if (testResult) {
            String convertedResult = "OK";
            System.out.println("Test " + testN + " result is: " + convertedResult);
        } else {
            String convertedResult = "FAIL";
            System.out.println("Test " + testN + " result is: " + convertedResult);
        }
    }
}
