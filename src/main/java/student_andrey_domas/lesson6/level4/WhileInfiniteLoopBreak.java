package student_andrey_domas.lesson6.level4;

public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        while (true) {
            long unixTimestamp = System.currentTimeMillis() / 1000L;
            if (unixTimestamp % 10 ==0) { break; }
        }
    }
}
