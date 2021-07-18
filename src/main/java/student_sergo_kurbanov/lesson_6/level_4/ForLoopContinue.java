package student_sergo_kurbanov.lesson_6.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ForLoopContinue {
    public void LoopContinue() {
        int max = 100;
        for (int i = 0; i < max; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
