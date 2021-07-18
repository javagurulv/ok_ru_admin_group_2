package student_andrey_tryapichnikov.lesson_5.level_6;

import student_andrey_tryapichnikov.boilerplate.BoilerplateStatic;

class ArrayUtilTest {
    ArrayUtil arrayUtil = new ArrayUtil();
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray(12);
        test.testRandom(12, 100);
        int[] testArray = {23, -13, 1, -13, 2, 5, 101};
        test.shouldFindMaxNumber(testArray, 101);
        test.shouldFindMaxNumber(testArray, 1);
        test.shouldFindMinNumber(testArray, -13);
        test.shouldFindMinNumber(testArray, 3);
    }

    public void testRandom(int arrayLength, int maxValue) {
        var numbers = arrayUtil.createArray(arrayLength);
        for (int i: numbers) System.out.println(i);
        arrayUtil.fillArrayWithRandomNumbers(numbers, maxValue);
        for (int i: numbers) System.out.println(i);
    }

    public void shouldCreateArray(int length) {
        BoilerplateStatic.printTestResult(arrayUtil.createArray(length).length == length);
    }

    public void shouldFindMaxNumber(int[] array, int maxNumber) {
        BoilerplateStatic.printTestResult(arrayUtil.findMaxNumber(array) == maxNumber);
    }

    public void shouldFindMinNumber(int[] array, int minNumber) {
        BoilerplateStatic.printTestResult(arrayUtil.findMinNumber(array) == minNumber);
    }

}
