package student_andrey_tryapichnikov.lesson_12.level_3;

public class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {
        var maxY = currentGeneration.length;
        var maxX = currentGeneration[0].length;
        var nextGeneration = new boolean[maxY][maxX];

        for (int y = 0 ; y < maxY; y++) {
            for (int x = 0 ; x < maxX; x++) {
                nextGeneration[y][x] = checkCell(currentGeneration, y, x);
            }
        }

        return nextGeneration;
    }

    boolean checkCell(boolean[][] currentGeneration, int y, int x) {
        var aliveCount = 0;
        for (int yAdj = -1; yAdj <= 1; yAdj++) {
            for (int xAdj = -1; xAdj <= 1; xAdj++) {
                if (yAdj == 0 && xAdj == 0) continue;
                try {
                    if (currentGeneration[y + yAdj][x + xAdj]) aliveCount += 1;
                } catch (IndexOutOfBoundsException e) {
                    // it's okay to not have all the neighbors in the corners
                }
            }
        }
        if (currentGeneration[y][x]) {
            // rules 1 and 2
            if (aliveCount < 2 || aliveCount > 3) return false;
        } else {
            // rule 4
            if (aliveCount == 3) return true;
        }
        // rule 3, sorta
        return currentGeneration[y][x];
    }

    void printField(boolean[][] field) {
        // this code duplicates calculate() method A LOT
        // would probably be better to generate this table as a property
        // if I didn't have to make it an effing stateless class :<
        var maxY = field.length;
        var maxX = field[0].length;
        var textField = new char[maxY][maxX];
        for (int y = 0 ; y < maxY; y++) {
            for (int x = 0 ; x < maxX; x++) {
                if (field[y][x]) {
                    textField[y][x] = 'x';
                } else {
                    textField[y][x] = '_';
                }
            }
        }
        for (char[] line: textField) {
            System.out.println(line);
        }
    }
}
