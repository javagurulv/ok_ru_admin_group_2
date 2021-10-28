package student_dmitry_drozdetsky.lesson_6.level_5.Task_22;

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
}
