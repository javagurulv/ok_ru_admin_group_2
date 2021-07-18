package student_sergo_kurbanov.lesson_6.level_5_6;

import java.util.Random;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TicTacToe {
    public int[][] createField() {
        return new int[][]{
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1},};
    }

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
                    return false;
                }
            }
        }
        return true;
    }

    public Move getNextMove() {
        // запросите у пользователя с консоли две координаты
        // клетки куда хочет походить игрок
        // создайте экземпляр класса Move и передайте ему
        // в конструктор введённые пользователем координаты
        // верните созданный объект Move из метода.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X [1-3]: ");
        int x = scanner.nextInt() - 1;
        System.out.print("Enter Y [1-3]: ");
        int y = scanner.nextInt() - 1;

        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        // распечатайте поле на консоль в читаемом формате
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
                    // default -> "invalid value " + field[i][j] + " in x=" + i + " y=" + j;
                };
                System.out.printf(" %s |", val);
            }
            System.out.printf(line);
        }

        System.out.println();
    }

    public void play() {
        int[][] field = createField();

        while (true) {
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


    private Move[] moves;

    private void calcAllSteps(int[][] field) {
        moves = new Move[field.length * field[0].length];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                moves[i * field.length + j] = new Move(i, j);
            }
        }
    }

    public void playAI() {
        int[][] field = createField();
        calcAllSteps(field);

        printFieldToConsole(field);
        while (true) {

            Move move0 = getNextMoveAI();
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

//            printFieldToConsole(field);
            Move move1 = getNextMoveAI();
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

    public Move getNextMoveAI() {
        Random random = new Random();

        int i = random.nextInt(moves.length);
        Move m = moves[i];
        RemoveMove(i);
        return m;
    }

    public void RemoveMove(int movePosition) {
        Move[] newMoves = new Move[moves.length - 1];

        for (int i = 0, j = 0; i < moves.length; i++) {
            if (i == movePosition) {
                continue;
            }
            newMoves[j] = moves[i];
            j++;
        }
        moves = newMoves;
    }
}
