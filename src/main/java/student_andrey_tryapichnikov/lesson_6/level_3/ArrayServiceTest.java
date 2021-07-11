package student_andrey_tryapichnikov.lesson_6.level_3;

public class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        ArrayService arrayServiceStatic = new ArrayService();
        int[] testArray1 = {1, 4, 24};
        test.testContains(testArray1, 4);
        test.testContains(testArray1, 0);
        int[] testArray2 = {113, 113, 23, 84, 113};
        test.testCounter(testArray2, 113);
        test.testCounter(testArray2, 0);
        test.testReplace(testArray2, 113, 180, true);
        arrayServiceStatic.printArray(testArray2);
        test.testReplace(testArray2, 113, 180, false);
        arrayServiceStatic.printArray(testArray2);
        test.testReplace(testArray2, 43, 180, true);
        arrayServiceStatic.printArray(testArray2);
        int[] testArray3 = {1342, 12, 4819, 234, 531, 801};
        test.testInverted(testArray3);
    }

    void testContains(int[] numbers, int number) {
        var msg = arrayService.contains(numbers, number) ? "%s is present\n" : "%s is missing\n";
        System.out.printf(msg, number);
    }

    void testCounter(int[] numbers, int number) {
        var counter = arrayService.countInstances(numbers, number);
        System.out.printf("cointains %s occurances of %s\n", counter, number);
    }

    void testReplace(int[] numbers, int searchNumber, int newNumber, boolean onlyFirst) {
        if (arrayService.replaceNumbers(numbers, searchNumber, newNumber, onlyFirst)) {
            System.out.printf("successfully replaced %s with %s\n", searchNumber, newNumber);
        } else {
            System.out.printf("%s not found, nothing to replace\n", searchNumber);
        }
    }

    void testInverted(int[] numbers) {
        arrayService.printArray(numbers);
        arrayService.invert(numbers);
        arrayService.printArray(numbers);
    }
}
