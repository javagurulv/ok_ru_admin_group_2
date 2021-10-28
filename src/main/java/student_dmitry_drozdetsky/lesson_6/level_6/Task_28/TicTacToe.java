package student_dmitry_drozdetsky.lesson_6.level_6.Task_28;

import java.util.Scanner;

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
        for (int j = 0; j < 3; j ++) {
            if ((field[0][j] == playerToCheck)
                    && (field[1][j] == playerToCheck)
                    && (field[2][j] == playerToCheck)
            ) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return ((field[0][0] == playerToCheck)
                && (field[1][1] == playerToCheck)
                && (field[2][2] == playerToCheck)
        ) || ((field[2][0] == playerToCheck)
                && (field[1][1] == playerToCheck)
                && (field[0][2] == playerToCheck)
        );
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        boolean someoneWin = (isWinPosition(field, 0)
                || isWinPosition(field, 1));
        boolean hasEmpty = false;
        for (int[] line: field) {
            for (int element: line) {
                if (element == -1) {
                    hasEmpty = true;
                    break;
                }
            }
        }
        return (!someoneWin && !hasEmpty);
    }

    public int[][] createField() {
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                array[i][j] = -1;
            }
        }
        return array;
    }

    public Move getNextMove() {
        int x = takeIntFromUser("x");
        int y = takeIntFromUser("y");
        return new Move(x, y);
    }

    private int takeIntFromUser(String name) {
        System.out.print("Введите " + name + ": ");
        Scanner scar = new Scanner(System.in);
        int value = scar.nextInt();
        scar.close();
        System.out.print("\n");
        return value;
    }

}
