package student_andrey_domas.lesson6.level4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for(;;) {
            long unixTimestamp = System.currentTimeMillis() / 1000L;
            if (unixTimestamp % 10 ==0) { break; }
        }
    }
}
