package student_sergo_kurbanov.lesson_6.level_5_6;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToe = new TicTacToeTest();
        ticTacToe.isWinPositionForHorizontalsTest();
        ticTacToe.isWinPositionForVerticalsTest();
        ticTacToe.isWinPositionForDiagonalsTest();
        ticTacToe.isDrawPositionTest();
        ticTacToe.createFieldTest();
    }

    public void isWinPositionForHorizontalsTest() {
        int[][] field = {
                {0, -1, 0},
                {1, 1, 1},
                {0, 0, 0},};
        TicTacToe ticTacToe = new TicTacToe();
        if (ticTacToe.isWinPositionForHorizontals(field, 0) &&
                ticTacToe.isWinPositionForHorizontals(field, 1)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void isWinPositionForVerticalsTest() {
        int[][] field = {
                {0, 1, 0},
                {1, 1, 0},
                {0, 1, 0},};
        TicTacToe ticTacToe = new TicTacToe();
        if (ticTacToe.isWinPositionForVerticals(field, 0) &&
                ticTacToe.isWinPositionForVerticals(field, 1)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void isWinPositionForDiagonalsTest() {
        int[][] field1 = {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0},};
        int[][] field2 = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1},};

        TicTacToe ticTacToe = new TicTacToe();

        if (ticTacToe.isWinPositionForDiagonals1(field1, 0) &&
                ticTacToe.isWinPositionForDiagonals2(field1, 0) &&
                ticTacToe.isWinPositionForDiagonals1(field2, 1) &&
                ticTacToe.isWinPositionForDiagonals2(field2, 1)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void isDrawPositionTest() {
        int[][] diagonal0Win = {
                {0, 1, 1},
                {1, 0, 1},
                {0, 1, 0},};
        int[][] notFinished = {
                {0, 0, 1},
                {1, 0, 0},
                {0, -1, 1},};
        int[][] draw = {
                {0, 0, 1},
                {1, 0, 0},
                {0, 1, 1},};

        TicTacToe ticTacToe = new TicTacToe();

        if (!ticTacToe.isDrawPosition(diagonal0Win) &&
                !ticTacToe.isDrawPosition(notFinished) &&
                ticTacToe.isDrawPosition(draw)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = ticTacToe.createField();

        if (CheckField(field)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    private boolean CheckField(int[][] field) {
        if (field.length != 3) {
            return false;
        }
        for (int i = 0; i < field.length; i++) {
            if (field[i].length != 3) {
                return false;
            }
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != -1) {
                    return false;
                }
            }
        }
        return true;
    }
}
