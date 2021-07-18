package student_andrey_domas.lesson6.level5;

import java.util.Scanner;
import java.util.regex.Pattern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TicTacToe {

    public Move getNextMove() {
        System.out.print("Move (x ,y): ");
        Scanner scanner = new Scanner(System.in);
        String moveStr = scanner.next(Pattern.compile("^\\d\s*,\s*\\d$"));
        String[] moveStrTokens = moveStr.split(",");
        int x = Integer.parseInt(moveStrTokens[0].strip());
        int y = Integer.parseInt(moveStrTokens[1].strip());
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                int pos = field[i][j];
                System.out.print(" " + (pos > -1 ? pos : ".") + " ");
            }
            System.out.println();
        }
    }

    public int[][] createField() {
        int field[][] = new int[3][3];
        for (int i = 0; i < field.length; i++)
            for (int j = 0; j < field[i].length; j++)
                field[i][j] = -1;
        return field;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++)
            for (int j = 0; j < field[i].length; j++)
                if (field[i][j] == -1)
                    return false;
        return !(isWinPosition(field, 0) || isWinPosition(field, 1));
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != playerToCheck) break;
                if (j == field[i].length - 1) return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] != playerToCheck) break;
                if (j == field[i].length - 1) return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean diagonalOne = true;
        boolean diagonalTwo = true;
        for (int i = 0; i < field.length; i++) {
            diagonalOne = diagonalOne && field[i][i] == playerToCheck;
            diagonalTwo = diagonalTwo && field[i][field.length - 1 - i] == playerToCheck;
            if (!(diagonalOne || diagonalTwo)) break;
            if (i == field.length - 1) return true;
        }
        return false;
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            System.out.println("Player 0 turn.");
            Move move0 = getNextMove();
            field[move0.getY()][move0.getX()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
            System.out.println("Player 1 turn.");
            Move move1 = getNextMove();
            field[move1.getY()][move1.getX()] = 1;
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                printFieldToConsole(field);
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                printFieldToConsole(field);
                break;
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
