package student_andrey_tryapichnikov.lesson_5.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayLength1 {
    public static void main(String[] args) {
        var numbers = new int[2];
        System.out.println(numbers[numbers.length-1]);
    }
}
