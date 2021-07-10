package student_sergo_kurbanov.lesson_6.level_5;

public class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int match = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == playerToCheck) {
                    match++;
                }
            }
            if (match == field.length) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int j = 0; j < field[0].length; j++) {
            int match = 0;
            for (int i = 0; i < field.length; i++) {
                if (field[i][j] == playerToCheck) {
                    match++;
                }
            }
            if (match == field.length) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals1(field, playerToCheck) ||
                isWinPositionForDiagonals2(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals1(int[][] field, int playerToCheck) {
        int match = 0;
        for (int i = 0, j = 0; i < field.length; i++, j++) {
            if (field[i][j] == playerToCheck) {
                match++;
            }
        }
        if (match == field.length) {
            return true;
        }
        return false;
    }

    public boolean isWinPositionForDiagonals2(int[][] field, int playerToCheck) {
        int match = 0;
        for (int i = field.length - 1, j = 0; i >= 0; i--, j++) {
            if (field[i][j] == playerToCheck) {
                match++;
            }
        }
        if (match == field.length) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        if (isWinPosition(field, 0) ||
                isWinPosition(field, 1)) {
            return false;
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    return true;
                }
            }
        }
        return false;
    }
}
