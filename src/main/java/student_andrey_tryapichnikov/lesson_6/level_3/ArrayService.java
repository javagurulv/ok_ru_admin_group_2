package student_andrey_tryapichnikov.lesson_6.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayService {
    void printArray(int[] numbers) {
        StringBuilder value = new StringBuilder();
        var i = 0;
        while (i < numbers.length) {
            value.append(numbers[i]).append(", ");
            i++;
        }
        // strip the last 2 symbols (", ") after joining
        value.delete(value.length()-2, value.length() -1);
        System.out.println(value);
    }
    boolean contains(int[] numbers, int number) {
        var i = 0;
        while (i < numbers.length) {
            if (i == number) return true;
            i++;
        }
        return false;
    }
    int countInstances(int[] numbers, int number) {
        var counter = 0;
        var i = 0;
        while (i < numbers.length) {
            if (i == number) counter++;
            i++;
        }
        return counter;
    }
    boolean replaceNumbers(int[] numbers, int searchNumber, int newNumber, boolean onlyFirst) {
        var replaced = false;
        var i = 0;
        while (i < numbers.length) {
            if (numbers[i] == searchNumber) {
                numbers[i] = newNumber;
                if (onlyFirst) return true;
                replaced = true;
            }
            i++;
        }
        return replaced;
    }
    void invert(int[] numbers) {
        var invertedNumbers = new int[numbers.length];
        var i = 0;
        while (i < numbers.length) {
            var invertedIndex = numbers.length - i - 1;
            invertedNumbers[invertedIndex] = numbers[i];
            i++;
        }
        i = 0;
        while (i < numbers.length) {
            numbers[i] = invertedNumbers[i];
            i++;
        }
    }
    void sort(int[] numbers) {
        boolean updated;
        while (true) {
            updated = false;
            for (int i = 1; i < numbers.length; i++) {
                var tmp = numbers[i - 1];
                if (numbers[i] < tmp) {
                    numbers[i - 1] = numbers[i];
                    numbers[i] = tmp;
                    updated = true;
                }
            }
            if (!updated) break;
        }
    }
}
