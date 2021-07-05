package student_dmitry_samsonov.lesson_6.level_3_junior;

import student_dmitry_samsonov.lesson_5.level_2_intern.Array;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 4};
        printTestResult("1 in array", arrayService.contains(arr, 1));
        printTestResult("3 in array", !arrayService.contains(arr, 3));

        int[] arr1 = {1, 2, 3, 3};
        printTestResult("3 count in array", arrayService.countOccurrences(arr1, 3) == 2);


        int[] arr2 = {1, 2, 3, 3};
        printTestResult("4 count in array", arrayService.countOccurrences(arr2, 4) == 0);

        int[] arr3 = {1, 2, 3, 3};
        printTestResult("replace first 3", arrayService.replaceFirst(arr3, 3, 8));
        printTestResult("replace all 3", arrayService.replaceAll(arr3, 3, 8) == 2);

        int[] arr4 = {1, 2, 3, 4};
        int[] arr4reverted = {4, 3, 2, 1};
        arrayService.revert(arr4);
        printTestResult("revert array 4", Arrays.equals(arr4, arr4reverted));
        int[] arr5 = {1, 2, 3, 4, 5};
        arrayService.revert(arr5);
        int[] arr5reverted = {5, 4, 3, 2, 1};
        printTestResult("revert array 5", Arrays.equals(arr5, arr5reverted));

        int[] arr6 = {2, 0, 9, 7};
        int[] arr6sorted = {0, 2, 7, 9};
        arrayService.sort(arr6);
        printTestResult("sort array", Arrays.equals(arr6, arr6sorted));

    }
    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }

}
