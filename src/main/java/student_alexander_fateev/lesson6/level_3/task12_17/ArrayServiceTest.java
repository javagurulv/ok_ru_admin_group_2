package student_alexander_fateev.lesson6.level_3.task12_17;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        ArrayService myArray = new ArrayService();
        int [] numbers = {3,6,8,10,4,7,4,0,4};

        test.containsTrue(numbers, myArray);
        test.containsFalse(numbers, myArray);
        test.checkNumberOfEntries(numbers, myArray);
        test.checkSubstituteFirstEntry(numbers, myArray);
        test.checkSubstituteAllEntries(numbers, myArray);
        test.checkReverseArray(numbers, myArray);
        test.checkSortArray(numbers, myArray);
    }

    void containsTrue(int [] arr, ArrayService myArray) {
        int numberToCheck = 6;
        boolean expectedResult = true;
        String message = "Array contains number " + numberToCheck;
        boolean result = myArray.contains(arr, numberToCheck);

        printMessageBool(message, result, expectedResult);
    }

    void containsFalse(int [] arr, ArrayService myArray) {
        int numberToCheck = 66;
        boolean expectedResult = false;
        String message = "Array does not contain number " + numberToCheck;
        boolean result = myArray.contains(arr, numberToCheck);

        printMessageBool(message, result, expectedResult);
    }

    void checkNumberOfEntries(int [] arr, ArrayService myArray) {
        int numberToCheck = 4;
        int expectedResult = 3;
        String message = "Array contains " + expectedResult + " entries of " + numberToCheck;
        int result = myArray.numberOfEntries(arr, numberToCheck);

        printMessageInt(message, result, expectedResult);
    }

    void checkSubstituteFirstEntry(int [] arr, ArrayService myArray) {
        int numberToSearch = 4;
        int newNumber = 500;
        int [] expectedResult = {3,6,8,10,500,7,4,0,4};
        String message = "Substitute only first entry of " + numberToSearch;

        boolean result = myArray.substituteFirstEntry(arr, numberToSearch, newNumber);

        if (result && Arrays.equals(arr, expectedResult)) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }

    void checkSubstituteAllEntries(int [] arr, ArrayService myArray) {
        int numberToSearch = 4;
        int newNumber = 500;
        int [] expectedResult = {3,6,8,10,500,7,500,0,500};
        int expectedEntries = 2;
        String message = "Substitute all entries of " + numberToSearch;

        int result = myArray.substituteAllEntries(arr, numberToSearch, newNumber);

        if ((result == expectedEntries) && Arrays.equals(arr, expectedResult)) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }

    void checkReverseArray(int [] arr, ArrayService myArray) {
        int [] expectedResult = {500,0,500,7,500,10,8,6,3};
        String message = "Reverse array";
        int [] result = myArray.reverseArray(arr);

        if (Arrays.equals(result, expectedResult)) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }

    void checkSortArray(int [] arr, ArrayService myArray) {
        int [] expectedResult = {0,3,6,7,8,10,500,500,500};
        String message = "Sorted array";
        myArray.sortArray(arr);

        if (Arrays.equals(arr, expectedResult)) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }

    void printMessageBool(String message, boolean result, boolean expectedResult) {
        if (result == expectedResult) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }

    void printMessageInt(String message, int result, int expectedResult) {
        if (result == expectedResult) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }
}
