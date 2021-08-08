package student_artem_aleksandrov.lesson6.level3;

public class ArrayServiceTest {
    public static void main(String[] args) {

        ArrayServiceTest serviceTest = new ArrayServiceTest();

        serviceTest.NumberInArray();
        serviceTest.NumberNotInArray();
        serviceTest.SeveralOccurrencesInArray();
    }

    public void NumberInArray() {
        int checknumber = 9000;
        int[] array = ArrayService.createRandomArray(10);
        array[2] = checknumber;

        if (ArrayService.contains(array, checknumber)) {
            Ok();
        } else {
            Fail();
        }
    }

    public void NumberNotInArray() {
        int checknumber = 9000;
        int[] array = ArrayService.createRandomArray(0);

        if (! ArrayService.contains(array, checknumber)) {
            Ok();
        } else {
            Fail();
        }
    }

    public void SeveralOccurrencesInArray() {
        int[] array = {1, 1, 2, 3};

        if (ArrayService.countOccurrences(array, 1) == 2 &&
                ArrayService.countOccurrences(array,3) == 1) {
            Ok();
        } else {
            Fail();
        }
    }
    public void Fail() {
        System.out.println("Test Failed");
    }

    public void Ok() {
        System.out.println("Test Ok");
    }
}
