package student_dmitry_samsonov.lesson_12_junit.level_3_junior;

import java.util.Arrays;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        //Правило 1:
        //Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
        // Правило 2:
        //Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.
        boolean[][] nextGeneration = Arrays.stream(currentGeneration).map(boolean[]::clone).toArray(boolean[][]::new);
        int y_MAX = currentGeneration.length - 1;
        int x_MAX = currentGeneration[0].length - 1;
        int aliveNeighbours;
        for (int y=0; y<=y_MAX; y++) {
            for (int x=0; x<=x_MAX; x++) {
                aliveNeighbours = countNeighboursOfType(currentGeneration, y, x, true);
                if (currentGeneration[y][x]) {
                    if (aliveNeighbours < 2 || aliveNeighbours > 3) {
                        nextGeneration[y][x] = false;
                    }
                } else {
                    if (aliveNeighbours == 3) {
                        nextGeneration[y][x] = true;
                    }
                }
            }
        }
        return nextGeneration;
    }
    private static int countNeighboursOfType(boolean[][] currentGeneration, int y, int x, boolean type) {
        // Для каждой ячейки с адресом ряд y, колонка x и значением true
        // проверяем наличие true в y-1, x-1, x, x+1
        //                          y, x-1, x+1
        //                          y+1, x-1, x, x+1
        // для каждого индекса проверять min/max

        int y_MAX = currentGeneration.length - 1;
        int x_MAX = currentGeneration[0].length - 1;
        int neighbours = 0;
        // y-1 row
        if (y - 1 >= 0) {
            // x-1
            if (x - 1 >= 0) {
                if (currentGeneration[y-1][x-1]) {
                    neighbours++;
                }
            }
            // x
            if (currentGeneration[y-1][x]) {
                neighbours++;
            }
            // x+1
            if (x + 1 <= x_MAX) {
                if (currentGeneration[y-1][x+1]) {
                    neighbours++;
                }
            }
        }

        // y row
        // x-1
        if (x - 1 >= 0) {
            if (currentGeneration[y][x-1]) {
                neighbours++;
            }
        }
        // x+1
        if (x + 1 <= x_MAX) {
            if (currentGeneration[y][x+1]) {
                neighbours++;
            }
        }

        // y+1 row
        if (y + 1 <= y_MAX) {
            // x-1
            if (x - 1 >= 0) {
                if (currentGeneration[y+1][x-1]) {
                    neighbours++;
                }
            }
            // x
            if (currentGeneration[y+1][x]) {
                neighbours++;
            }
            // x+1
            if (x + 1 <= x_MAX) {
                if (currentGeneration[y+1][x+1]) {
                    neighbours++;
                }
            }
        }
    return neighbours;
    }

}

