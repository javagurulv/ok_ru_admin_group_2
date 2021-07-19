package student_alexander_fateev.lesson5.level_5.task31_32_33;

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil myArray = new ArrayUtil();

        int arrayLength = 7;
        int [] numbers = myArray.createArray(arrayLength);
        myArray.fillArrayWithRandomNumbers(numbers);

        for (int i=0; i<arrayLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
