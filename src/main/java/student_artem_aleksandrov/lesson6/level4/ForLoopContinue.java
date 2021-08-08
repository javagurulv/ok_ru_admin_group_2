package student_artem_aleksandrov.lesson6.level4;

import java.util.Random;

public class ForLoopContinue {
    public static void main(String[] args) {
        int luckyNumber = 7;

        Random random = new Random();

        for (int i = 0; true; i++) {
            System.out.println("You are in infinity loop");

            if (i + 1 == Integer.MAX_VALUE) {
                i = 0;
            }

            if (luckyNumber == random.nextInt(10)) {
                System.out.println("You are lucky man. Got %d".formatted(luckyNumber));
                break;
            }
        }
    }
}
