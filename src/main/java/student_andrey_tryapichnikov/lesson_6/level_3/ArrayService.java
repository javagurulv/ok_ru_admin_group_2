package student_andrey_tryapichnikov.lesson_6.level_3;

class ArrayService {
    void printArray(int[] numbers) {
        String value = "";
        for (int i: numbers) value = value + i + ", ";
        System.out.println(value);
    }
    boolean contains(int[] numbers, int number) {
        for (int i: numbers) if (i == number) return true;
        return false;
    }
    int countInstances(int[] numbers, int number) {
        var counter = 0;
        for (int i: numbers) if (i == number) counter++;
        return counter;
    }
    boolean replaceNumbers(int[] numbers, int searchNumber, int newNumber, boolean onlyFirst) {
        boolean replaced = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                numbers[i] = newNumber;
                if (onlyFirst) return true;
                replaced = true;
            }
        }
        return replaced;
    }
    void invert(int[] numbers) {
        var invertedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            var invertedIndex = numbers.length - 1 - i;
            invertedNumbers[invertedIndex] = numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = invertedNumbers[i];
        }
    }
}
