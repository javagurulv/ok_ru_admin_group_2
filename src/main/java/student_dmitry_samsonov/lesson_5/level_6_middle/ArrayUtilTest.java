package student_dmitry_samsonov.lesson_5.level_6_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }
    public void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }

    public void shouldCreateArray() {
        int length = 5;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = arrayUtil.createArray(5);
        printTestResult("Array length", arr.length == length);
    }

    public void shouldFindMaxNumber() {
        int length = 2;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = arrayUtil.createArray(length);
        arr[0] = 1;
        arr[1] = 5;
        int max = 5;
        printTestResult("Max", arrayUtil.findMaxNumber(arr) == max);
    }

    public void shouldFindMinNumber() {
        int length = 2;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = arrayUtil.createArray(length);
        arr[0] = 1;
        arr[1] = 5;
        int min = 1;
        printTestResult("Min", arrayUtil.findMinNumber(arr) == min);
    }
}