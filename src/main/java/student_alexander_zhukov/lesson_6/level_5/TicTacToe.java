package student_alexander_zhukov.lesson_6.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean result = false;
        for (int i = 0; i < field.length; i++) {
            if (result) {
                break;
            }
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != playerToCheck) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean result = false;
        for (int i = 0; i < field[0].length; i++) {
            if (result) {
                break;
            }
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] != playerToCheck) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean result = false;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - 1 - i] != playerToCheck) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean horizontal = isWinPositionForHorizontals(field, playerToCheck);
        boolean vertical = isWinPositionForVerticals(field, playerToCheck);
        boolean diagonal = isWinPositionForDiagonals(field, playerToCheck);
        return horizontal || vertical || diagonal;
    }

    public boolean isDrawPosition(int[][] field) {
        if (isWinPosition(field,1) || isWinPosition(field, 0)) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < field.length; i++) {
            if (result) {
                break;
            }
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
        }
        return result;
    }
}
