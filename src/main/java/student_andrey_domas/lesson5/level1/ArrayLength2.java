package student_andrey_domas.lesson5.level1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayLength2 {

    public static void main(String[] args) {
        int numbers[] = new int[3];
        //         ^^           ^
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }

}