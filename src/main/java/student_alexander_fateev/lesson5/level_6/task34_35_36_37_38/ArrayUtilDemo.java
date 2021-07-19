package student_alexander_fateev.lesson5.level_6.task34_35_36_37_38;

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil myArray = new ArrayUtil();

        int arrayLength = 7;
        int [] numbers = myArray.createArray(arrayLength);

        myArray.fillArrayWithRandomNumbers(numbers);
        myArray.printArrayToConsole(numbers);
        System.out.println("\nArray biggest element is " +myArray.findMaxNumber(numbers));
        System.out.println("Array minimal element is " +myArray.findMinNumber(numbers));
    }
}
