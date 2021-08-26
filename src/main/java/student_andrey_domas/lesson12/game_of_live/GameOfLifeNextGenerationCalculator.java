package student_andrey_domas.lesson12.game_of_live;

class GameOfLifeNextGenerationCalculator {

    private boolean[] northRow(boolean[][] g, int row) {
        return row == 0 ? g[g.length - 1] : g[row - 1];
    }

    private boolean[] southRow(boolean[][] g, int row) {
        return row == g.length - 1 ? g[0] : g[row + 1];
    }

    private boolean eastColumn(boolean[] row, int column) {
        return column == row.length  - 1 ? row[0] : row[column + 1];
    }

    private boolean westColumn(boolean[] row, int column) {
        return column == 0 ? row[row.length - 1] : row[column - 1];
    }

    private int liveNeighboursCount(boolean[][] g, int row, int column) {
        int liveNeighbours = 0;

        liveNeighbours += eastColumn(g[row], column) ? 1 : 0;  // east
        liveNeighbours += westColumn(g[row], column) ? 1 : 0;  // west

        boolean[] northRow = northRow(g, row);
        liveNeighbours += northRow[column] ? 1 : 0;  // north
        liveNeighbours += westColumn(northRow, column) ? 1 : 0;  // north-west
        liveNeighbours += eastColumn(northRow, column) ? 1 : 0;  // north-east

        boolean[] southRow = southRow(g, row);
        liveNeighbours += southRow[column] ? 1 : 0;  // south
        liveNeighbours += westColumn(southRow, column) ? 1 : 0;  // south-west
        liveNeighbours += eastColumn(southRow, column) ? 1 : 0;  // south-east

        return liveNeighbours;
    }

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] newGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];
        for (int row = 0; row < currentGeneration.length; row++)
            for (int column = 0; column < currentGeneration[row].length; column++) {
                int liveNeighbours = liveNeighboursCount(currentGeneration, row, column);
                boolean cell = currentGeneration[row][column];
                newGeneration[row][column] = cell && (liveNeighbours >= 2 && liveNeighbours <= 3) || liveNeighbours == 3;
            }
        return newGeneration;
    }

}