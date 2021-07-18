package student_dmitry_samsonov.lesson_6.level_1_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();

        // if (numberUtils.isEven(6)){
        if (numberUtils.isEven(6) == true){
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }
}
