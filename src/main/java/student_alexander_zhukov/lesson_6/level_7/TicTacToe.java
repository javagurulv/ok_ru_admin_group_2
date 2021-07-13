package student_alexander_zhukov.lesson_6.level_7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        if (!result) {
            for (int i = 0; i < field.length; i++) {
                if (field[i][field.length - 1 - i] != playerToCheck) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
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

    public void aiMove(int[][] field) {
        Random random = new Random();
        int[][] tmpField = new int[field.length][field[0].length];
        for (int i = 0; i < field.length; i++) {
            tmpField[i] = Arrays.copyOf(field[i], field[i].length);
        }
        // check win 1 move
        boolean simpleMove = true;
        for (int i = 0; i < tmpField.length; i++) {
            for (int j = 0; j < tmpField[i].length; j++) {
                if (simpleMove && tmpField[i][j] == -1) {
                    tmpField[i][j] = 1;
                    if (isWinPosition(tmpField, 1)) {
                        System.out.println("set 1 " + i + " " + j);
                        field[i][j] = 1;
                        simpleMove = false;
                        break;
                    } else {
                        tmpField[i][j] = -1;
                        System.out.println("set -1 " + i + " " + j);
                    }
                }
            }
        }
        System.out.println("tmpField");
        printFieldToConsole(tmpField);
        System.out.println("Field");
        printFieldToConsole(field);
        System.out.println("for-1 " + simpleMove);
        // check lose 1 move and defense
        if (simpleMove) {
            for (int i = 0; i < tmpField.length; i++) {
                for (int j = 0; j < tmpField[i].length; j++) {
                    if (simpleMove && tmpField[i][j] == -1) {
                        tmpField[i][j] = 0;
                        System.out.println("set 0 " + i + " " + j);
                        if (isWinPosition(tmpField, 0)) {
                            System.out.println("set 1 " + i + " " + j);
                            field[i][j] = 1;
                            simpleMove = false;
                            break;
                        } else {
                            tmpField[i][j] = -1;
                            System.out.println("set -1 " + i + " " + j);
                        }
                    }
                }
            }
        }
        System.out.println("tmpField");
        printFieldToConsole(tmpField);
        System.out.println("Field");
        printFieldToConsole(field);
        System.out.println("for-2 " + simpleMove);
        while (simpleMove) {
            int x = random.nextInt(3);
            int y = random.nextInt(3);
            if (field[x][y] == -1) {
                field[x][y] = 1;
                System.out.println("Simple move " + x + " " + y);
                break;
            }
        }
    }

    public void play() {
        int[][] field = createField();
        printFieldToConsole(field);
        while(true) {
            //printFieldToConsole(field);
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

            //printFieldToConsole(field);
            //Move move1 = getNextMove();
            //field[move1.getX()][move1.getY()] = 1;
            aiMove(field);
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
