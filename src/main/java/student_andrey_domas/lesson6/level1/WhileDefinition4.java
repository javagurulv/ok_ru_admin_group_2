package student_andrey_domas.lesson6.level1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WhileDefinition4 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        //  ^^^^
        }
    }

}
