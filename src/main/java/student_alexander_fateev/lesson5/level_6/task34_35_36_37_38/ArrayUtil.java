package student_alexander_fateev.lesson5.level_6.task34_35_36_37_38;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int findMaxNumber(int[] array) {
        int arrayMaxNumber = 0;
        for (int i=0; i<array.length; i++) {
            if ((i == 0) || (array[i] > arrayMaxNumber)) {
                arrayMaxNumber = array[i];
            }
        }

        return arrayMaxNumber;
    }

    public int findMinNumber(int[] array) {
        int arrayMinNumber = 0;
        for (int i=0; i<array.length; i++) {
            if ((i == 0) || (array[i] < arrayMinNumber)) {
                arrayMinNumber = array[i];
            }
        }

        return arrayMinNumber;
    }
}
