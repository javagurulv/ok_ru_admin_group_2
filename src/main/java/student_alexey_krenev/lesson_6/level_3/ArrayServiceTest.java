package student_alexey_krenev.lesson_6.level_3;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        int[] testArray1 = {-1, 3, 1024};
        test.testExists(testArray1, 3);
        test.testExists(testArray1, -100);

        int[] testArray2 = {-1, 3, 1024, 4, 4, -1, 1};
        test.testCount(testArray2, 4);
        test.testCount(testArray2, 1);
    }


    void testExists(int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        var message = arrayService.contains(arr, numberToSearch) ? "%s exists\n" : "%s not exists\n";
        System.out.printf(message, numberToSearch);
    }

    void testCount(int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        int counter = arrayService.countOccurrences(arr, numberToSearch);
        System.out.println("num containts in array " +counter+ " times");

    }


}
