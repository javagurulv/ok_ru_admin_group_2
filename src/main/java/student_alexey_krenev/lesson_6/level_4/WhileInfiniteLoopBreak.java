package student_alexey_krenev.lesson_6.level_4;

import java.util.Random;

class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int rnd = random.nextInt();
            System.out.println(rnd);
            if (rnd %3 == 0){
                break;
            }
        }
    }
}
