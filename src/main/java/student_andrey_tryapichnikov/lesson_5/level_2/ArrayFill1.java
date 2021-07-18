package student_andrey_tryapichnikov.lesson_5.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayFill1 {
    public static void main(String[] args) {
        var numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 82;
        numbers[2] = -18;

        for (int i: numbers) System.out.println(i);
    }
}
