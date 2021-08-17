package student_artem_aleksandrov.lesson6.level5;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    int fieldDimension = 3;
    int[][] field;

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(3);

        System.out.println("Game started with fieldDimension = %d".formatted(game.fieldDimension));
        game.play();

    }

    public TicTacToe() {
        field = createField(fieldDimension);
    }

    public TicTacToe(int fieldDimension) {
        this.fieldDimension = fieldDimension;
        field = createField(fieldDimension);
    }

    public int[][] createField(int fieldDimension) {
        int[][] field = new int[fieldDimension][fieldDimension];

        for (int[] row:field) {
            fillArray(row);
        }
        return field;
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
    }

    private boolean checkIfFieldFull() {
        for (int[] row : this.field) {
            for (int i = 0; i < fieldDimension; i++) {
                if (row[i] == -1) return false;
            }
        }
        return true;
    }

    private boolean checkIfFieldFull(int[][] field) {
        for (int[] row : field) {
            for (int i = 0; i < field.length; i++) {
                if (row[i] == -1) return false;
            }
        }
        return true;
    }

    private boolean checkIfPositionIsUsed(int x, int y) {
        if (this.field[x][y] == -1) {
            return false;
        }
        return true;
    }

    public void printFieldToConsole() {
        String line = "\n-------------";
        String nl = "\n|";

        System.out.printf(line);
        for (int i = 0; i < field.length; i++) {
            System.out.printf(nl);
            for (int j = 0; j < field[i].length; j++) {
                String val = switch (field[i][j]) {
                    case 0 -> "0";
                    case 1 -> "X";
                    case -1 -> " ";
                    default -> "!";
                };
                System.out.printf(" %s |", val);
            }
            System.out.printf(line);
        }

        System.out.println();
    }


    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] row:field) {

            // Get array of unique values
            int [] rowDistinct = Arrays.stream(row).distinct().toArray();

            if (rowDistinct.length == 1 && rowDistinct[0] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean isWin = true;

        int dimension = field[0].length;

        for (int i = 0; i < dimension; i++) {
            isWin = true;
            for (int[] row:field) {
                if (row[i] != playerToCheck) {
                    isWin = false;
                    break;
                }
            }
            // Check result of row
            if (isWin) return true;
        }
        return isWin;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        int dimension = field[0].length;

        // We have only two Diagonals to check
        // 1. From left to right / upper - down
        boolean isWin = true;
        for (int i = 0; i < dimension; i++) {
            if (field[i][i] != playerToCheck) {
                isWin = false;
                break;
            }
        }
        if (isWin) return true;


        // 2. From right to left /  down - upper
        isWin = true;
        for (int i = dimension -1; i > 0; i--) {
            if (field[i][i] != playerToCheck) {
                isWin = false;
                break;
            }
        }
        return isWin;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (
                isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck)
        ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrawPosition(int[][] field) {
        if (! checkIfFieldFull(field)) return false;
        if (
                isWinPosition(field, 0) ||
                isWinPosition(field, 1)
        ) {
            return true;
        }
        return false;
    }

    public Move getNextMove() {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Write X:");
            int x = scanner.nextInt();

            System.out.println("Write Y:");
            int y = scanner.nextInt();

            Move move = new Move(x, y);
            if (!checkIfPositionIsUsed(x, y)) {
                return move;
            } else {
                System.out.println("This position is already used");
            }
        }
    }

    public void play() {
        while(true) {
            printFieldToConsole();
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;

            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole();
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;

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
