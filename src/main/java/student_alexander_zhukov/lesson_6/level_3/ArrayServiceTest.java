package student_alexander_zhukov.lesson_6.level_3;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest newTest = new ArrayServiceTest();
        int[] arr = newTest.createArr();
        newTest.containsTest(arr,3, true);
        newTest.containsTest(arr,10, false);
        newTest.countOccurrencesTest(arr, 2, 2);
        newTest.countOccurrencesTest(arr, 3, 3);
        newTest.countOccurrencesTest(arr, 6, 1);
        newTest.countOccurrencesTest(arr, 9, 0);

        /*
        for (int i:arr) {
             System.out.print(i + " ");
         }
         System.out.println("");
        */

        newTest.replaceFirstTest(arr,3,999,true);
        newTest.replaceFirstTest(arr,6,999,true);
        newTest.replaceFirstTest(arr,999,7,true);
        newTest.replaceFirstTest(arr,99,7,false);

        /*
        for (int i:arr) {
            System.out.print(i + " ");
        }
        */
        newTest.replaceAllTest(newTest.createArr(), 3, 55, 3);
        newTest.replaceAllTest(newTest.createArr(), 6, 66, 1);
        newTest.replaceAllTest(newTest.createArr(), 9, 8, 0);
        newTest.revertTest(newTest.createArr());
        newTest.sortTest(newTest.createArr());

    }

    public int[] createArr() {
        return new int[] {1, 2, 3, 2, 3, 6, 3};
    }

    public void containsTest(int[] arr, int number, boolean answer) {
        ArrayService testContains = new ArrayService();
        boolean result = (testContains.contains(arr, number) == answer);
        checkTestResult(result,"containsTest number " + number);
    }

    public void countOccurrencesTest(int[] arr, int number, int answer) {
        ArrayService testCount = new ArrayService();
        boolean result = (testCount.countOccurrences(arr, number) == answer);
        checkTestResult(result,"countOccurrencesTest number " + number);
    }

    public void replaceFirstTest(int[] arr, int numberToReplace, int number, boolean answer) {
        ArrayService testReplace = new ArrayService();
        boolean result = (testReplace.replaceFirst(arr, numberToReplace, number) == answer);
        checkTestResult(result,"replaceFirstTest " + numberToReplace + " -> " + number);
    }

    public void replaceAllTest(int[] arr, int numberToReplace, int number, int answer) {
        ArrayService testReplaceAll = new ArrayService();
        boolean result = (testReplaceAll.replaceAll(arr, numberToReplace, number) == answer);
        checkTestResult(result,"replaceAllTest " + numberToReplace + " -> " + number);
    }

    public void revertTest(int[] arr) {
        ArrayService testRevert = new ArrayService();
        testRevert.revert(arr);
        int[] revertArr = new int[] {3, 6, 3, 2, 3, 2, 1};
        boolean result = (Arrays.equals(arr, revertArr));
        checkTestResult(result,"revertTest ");
    }

    public void sortTest(int[] arr) {
        ArrayService testSort = new ArrayService();
        testSort.sort(arr);
        int[] sortArr = new int[] {1, 2, 2, 3, 3, 3, 6};
        boolean result = (Arrays.equals(arr, sortArr));
        checkTestResult(result,"sortTest ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
