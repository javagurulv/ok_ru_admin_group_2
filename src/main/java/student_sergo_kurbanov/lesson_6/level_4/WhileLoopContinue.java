package student_sergo_kurbanov.lesson_6.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WhileLoopContinue {
    public void LoopContinue() {
        int i = 0;
        int max = 100;
        // print even number
        while (i < max) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
