package student_andrey_tryapichnikov.lesson_6.level_5;

public class TicTacToe {
    int[][] field;

    TicTacToe(int[][] fieldValues) throws AssertionError {
        // technically tic-tac-toe can be played on a field of any size
        // but to simplify diagonal checks, let's at least keep it square
        try {
            assert (fieldValues[0].length != fieldValues.length);
        } catch (AssertionError e) {
            System.out.println("Incorrect field size!");
            throw new AssertionError(e);
        }
        field = fieldValues;
    }

    TicTacToe(int size) {
        field = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int a = 0; a < size; a++) {
                field[i][a] = -1;
            }
        }
    }

    TicTacToe() {
        this(3);
    }

    void printField() {
        for (int[] line: field) {
            var lineString = new StringBuilder();
            for (int value: line) {
                switch (value) {
                    case -1 -> lineString.append("  ");
                    case 0 -> lineString.append("x ");
                    case 1 -> lineString.append("o ");
                }
            }
            System.out.println(lineString);
        }
    }

    boolean isWinPositionForHorizontals(int playerToCheck) {
        var counter = 0;
        var line = 0;
        while (line < field.length) {
            for (int i: field[line]) if (i == playerToCheck) counter++;
            if (counter == field[line].length) return true;
            counter = 0;
            line++;
        }
        return false;
    }

    boolean isWinPositionForVerticals(int playerToCheck) {
        var counter = 0;
        var column = 0;
        while (column < field.length) {
            for (int line = 0; line < field.length; line++) {
                if (field[line][column] == playerToCheck) counter++;
                if (counter == field.length) return true;
            }
            counter = 0;
            column++;
        }
        return false;
    }

    boolean isWinPositionForDiagonals(int playerToCheck) {
        var counter = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == playerToCheck) counter++;
            if (counter == field.length) return true;
        }
        counter = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[i].length - i - 1] == playerToCheck) counter++;
            if (counter == field.length) return true;
        }
        return false;
    }

    boolean isWinPosition(int playerToCheck) {
        return (
                isWinPositionForHorizontals(playerToCheck)
                        || isWinPositionForVerticals(playerToCheck)
                        || isWinPositionForDiagonals(playerToCheck)
        );
    }
}
