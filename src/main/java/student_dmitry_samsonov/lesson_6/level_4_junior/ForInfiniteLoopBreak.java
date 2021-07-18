package student_dmitry_samsonov.lesson_6.level_4_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (;;) {
            break;
        }
    }
}
