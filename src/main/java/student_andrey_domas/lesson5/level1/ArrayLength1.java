package student_andrey_domas.lesson5.level1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayLength1 {

    public static void main(String[] args) {
        int numbers[] = new int[2];
        //         ^^
        System.out.println(numbers[1]);
        //                         ^
    }

}