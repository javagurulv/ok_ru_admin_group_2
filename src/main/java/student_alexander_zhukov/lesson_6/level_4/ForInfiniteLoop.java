package student_alexander_zhukov.lesson_6.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ForInfiniteLoop {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i = 1) {
            System.out.print("infinity ");
        }
    }
}
