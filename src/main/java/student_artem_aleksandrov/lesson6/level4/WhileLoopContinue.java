package student_artem_aleksandrov.lesson6.level4;

import java.util.Random;

public class WhileLoopContinue {
    public static void main(String[] args) {
        Random random = new Random();
        int number = 7;
        while (true) {

            System.out.println("You are inside infinity loop");
            if (number == random.nextInt(10)) {
                System.out.println("You are lucky man. Got %d".formatted(number));
                break;
            };
        }
    }
}
