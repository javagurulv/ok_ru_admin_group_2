package student_sergo_kurbanov.lesson_6.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WhileInfiniteLoopBreak {
    public void LoopBreak() {
        int i = 0;
        int max = 100;
        while (true) {
            if (i == max) {
                break;
            }
            i++;
        }
    }
}
