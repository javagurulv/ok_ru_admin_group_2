package student_alexander_fateev.lesson5.level_5.task31_32_33;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
//        int [] numbers = new int[arrayLength];

        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}
