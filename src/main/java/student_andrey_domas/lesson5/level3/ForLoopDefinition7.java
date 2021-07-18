package student_andrey_domas.lesson5.level3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ForLoopDefinition7 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            //                       ^ remove trailing {
            System.out.println(i);

    }
}