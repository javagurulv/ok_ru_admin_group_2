package student_sergo_kurbanov.lesson_6.level_3;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();

        test.testContains();
        test.testNotContains();
        test.countOccurrencesTest();
        test.countZeroOccurrencesTest();
        test.testReplaceFirst();
        test.testCantReplaceFirst();
        test.testReplaceAll();
        test.testCantReplaceAll();
        test.testRevert();
        test.testSort();
    }

    public void testContains() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean result = arrayService.contains(testArray, 5);
        if (result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void testNotContains() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean result = !arrayService.contains(testArray, 34);
        if (result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void countOccurrencesTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};
        int numberToSearch = 9;
        int expectedResult = 4;

        int result = arrayService.countOccurrences(testArray, numberToSearch);
        if (result == expectedResult) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void countZeroOccurrencesTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};
        int numberToSearch = 56;
        int expectedResult = 0;

        int result = arrayService.countOccurrences(testArray, numberToSearch);
        if (result == expectedResult) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void testReplaceFirst() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};
        int numberToReplace = 9;
        int newNumber = 97;
        boolean expectedResult = true;

        boolean result = arrayService.replaceFirst(testArray, numberToReplace, newNumber);
        if (result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void testCantReplaceFirst() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};
        int numberToReplace = 500;
        int newNumber = 97;
        boolean expectedResult = false;

        boolean result = !arrayService.replaceFirst(testArray, numberToReplace, newNumber);
        if (result) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void testReplaceAll() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};
        int numberToReplace = 9;
        int newNumber = 97;
        int expectedResult = 4;

        int result = arrayService.replaceAll(testArray, numberToReplace, newNumber);
        if (result == expectedResult) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void testCantReplaceAll() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};
        int numberToReplace = 53;
        int newNumber = 97;
        int expectedResult = 0;

        int result = arrayService.replaceAll(testArray, numberToReplace, newNumber);
        if (result == expectedResult) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void testRevert() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};
        int[] testArrayCopy = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};

        arrayService.revert(testArray);
        arrayService.revert(testArray);

        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] != testArrayCopy[i]) {
                System.out.println("FAIL");
                return;
            }
        }
        System.out.println("PASS");
    }

    public void testSort() {
        ArrayService arrayService = new ArrayService();
        int[] testSortedArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};
        int[] testUnSortedArray = {1, 9, 5, 9, 6, 7, 2, 8, 9, 0, 9, 3, -1, 4};

        arrayService.sort(testUnSortedArray);

        for (int i = 0; i < testSortedArray.length; i++) {
            if (testUnSortedArray[i] != testSortedArray[i]) {
                System.out.println("FAIL");
                return;
            }
        }
        System.out.println("PASS");
    }
}
