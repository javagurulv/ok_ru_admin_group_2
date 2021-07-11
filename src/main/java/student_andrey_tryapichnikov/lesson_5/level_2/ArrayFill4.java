package student_andrey_tryapichnikov.lesson_5.level_2;

import java.util.Random;

class ArrayFill4 {
    public static void main(String[] args) {
        var maxValue = 100;
        var numbers = new int[3];
        var random = new Random();
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt() % maxValue;
        }
        for (int i: numbers) result += i;
        System.out.println(result);
    }
}
