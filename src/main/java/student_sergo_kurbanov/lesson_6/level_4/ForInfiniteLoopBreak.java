package student_sergo_kurbanov.lesson_6.level_4;

public class ForInfiniteLoopBreak {
    public void EndlessLoopBreak() {
        int i = 0;
        int max = 100;
        for (; ; ) {
            if (i == max) {
                break;
            }
            i++;
        }
    }
}
