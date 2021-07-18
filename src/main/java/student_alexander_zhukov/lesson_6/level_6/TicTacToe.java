package student_alexander_zhukov.lesson_6.level_6;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }


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
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField() {
        int [][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
               field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x (int): 1-3");
        int x = scanner.nextInt() - 1;
        System.out.println("Input y (int): 1-3");
        int y = scanner.nextInt() - 1;
        Move newMove = new Move(x,y);
        return newMove;
    }

    public void printFieldToConsole(int[][] field) {
        System.out.println(" ");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println(" ");
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
