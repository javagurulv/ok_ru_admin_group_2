package student_dmitry_drozdetsky.lesson_6.level_5.Task_23;

public class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] line: field) {
            if ((line[0] == playerToCheck)
                    && (line[1] == playerToCheck)
                    && (line[2] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i ++) {
            if ((field[0][i] == playerToCheck)
                    && (field[1][i] == playerToCheck)
                    && (field[2][i] == playerToCheck)
            ) {
                return true;
            }
        }
        return false;
    }
}
