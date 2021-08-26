package student_alexander_fateev.lesson6.level_5.task22;

class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i=0; i<3; i++) {
            if (
                    (field[i][0] == field[i][1]) &&
                    (field[i][0] == field[i][2]) &&
                    (field[i][0] == playerToCheck)
            ) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i=0; i<3; i++) {
            if (
                    (field[0][i] == field[1][i]) &&
                    (field[0][i] == field[2][i]) &&
                    (field[0][i] == playerToCheck)
            ) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (
                (field[0][0] == field[1][1]) &&
                (field[0][0] == field[2][2]) &&
                (field[0][0] == playerToCheck)) {
            return true;
        }
        else if (
                (field[0][2] == field[1][1]) &&
                (field[0][2] == field[2][0]) &&
                (field[0][2] == playerToCheck)) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck) ||
            isWinPositionForVerticals(field, playerToCheck) ||
            isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        boolean emptyCell = false;
        for (int [] i:field) {
            for (int j:i) {
                if (j==-1) {
                    emptyCell = true;
                    break;
                }
            }
            if (emptyCell==true) {
                break;
            }
        }

        boolean result0 = isWinPosition(field, 0);
        boolean result1 = isWinPosition(field, 1);

        if ((result0 == false) && (result1 == false) && (emptyCell == false)) {
            return true;
        }
        return false;
    }
}
