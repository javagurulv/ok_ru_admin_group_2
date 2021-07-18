package student_dmitry_samsonov.lesson_6.level_5_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        boolean win;
        for (int[] i: field) {
            win = true;
            for (int k: i) {
                if (k != playerToCheck) {
                    win = false;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean win;
        for (int i=0; i<field.length; i++) {
            win = true;
            for (int[] k: field) {
                if (k[i] != playerToCheck) {
                    win = false;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        boolean win;
        // left upper corner to right lower
        win = true;
        for (int i=0; i<field.length; i++) {
            for (int k=0; k<field[i].length; k++) {
                if (i == k && field[i][k] != playerToCheck) {
                    win = false;
                }
            }
        }
        if (win) {
            return true;
        }
        // lright upper corner to left lower
        win = true;
        for (int i=0; i<field.length; i++) {
            for (int k=0; k<field[i].length; k++) {
                if (i + k == field.length - 1 && field[i][k] != playerToCheck) {
                    win = false;
                }
            }
        }
        if (win) {
            return true;
        }
        return false;
    }
    public boolean isWinPosition(int[][] field, int playerToCheck){
        return (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck));
    }
    public boolean isFieldFilled(int[][] field){
        for (int[] i: field) {
            for (int k: i) {
                if (k == -1){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isDrawPosition(int[][] field){
        if (!isFieldFilled(field)) {
            return false;
        }
        for (int i=0; i<=1; i++){
            if (isWinPosition(field, i)) {
                return false;
            }
        }
        return true;
    }
}
