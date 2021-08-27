package student_alexander_fateev.lesson6.level_5_6.task22_30;

import java.util.Scanner;

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

    public int[][] createField() {
        int [][] field = {{-1,-1,-1},
                          {-1,-1,-1},
                          {-1,-1,-1}};
        return field;
    }

    public Move getNextMove() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input X: ");
        int x = scan.nextInt();
        System.out.print("Input Y: ");
        int y = scan.nextInt();

        Move newMove = new Move(x, y);
        return newMove;
    }

    public void printFieldToConsole(int[][] field) {
        for (int [] i:field) {
            System.out.print("|");
            for (int j:i) {
                switch (j) {
                    case -1:
                        System.out.print(" ");
                        break;
                    case 0:
                        System.out.print("o");
                        break;
                    case 1:
                        System.out.print("x");
                        break;
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
