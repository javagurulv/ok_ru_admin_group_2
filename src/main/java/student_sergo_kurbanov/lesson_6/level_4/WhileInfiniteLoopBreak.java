package student_sergo_kurbanov.lesson_6.level_4;

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
