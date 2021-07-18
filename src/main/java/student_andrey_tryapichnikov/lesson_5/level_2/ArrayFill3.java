package student_andrey_tryapichnikov.lesson_5.level_2;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayFill3 {
    public static void main(String[] args) {
        var maxValue = 100;
        var numbers = new int[3];
        var random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt() % maxValue;
        }
        for (int i: numbers) System.out.println(i);
    }
}
