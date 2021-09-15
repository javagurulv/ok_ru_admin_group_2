package student_dmitry_samsonov.lesson_12_junit.level_3_junior;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {
    public boolean[][] generate(int fieldWidth, int fieldHeight){
        boolean[][] field = new boolean[fieldHeight][fieldWidth];
        Random random = new Random();
        for (int y=0; y<fieldHeight; y++){
            for (int x=0; x<fieldWidth; x++) {
                field[y][x] = random.nextBoolean();
            }
        }
        return field;
    }
}
