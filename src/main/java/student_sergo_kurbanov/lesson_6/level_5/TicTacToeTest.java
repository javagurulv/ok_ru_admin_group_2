package student_sergo_kurbanov.lesson_6.level_5;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToe = new TicTacToeTest();
        ticTacToe.isWinPositionForHorizontalsTest();
        ticTacToe.isWinPositionForVerticalsTest();
        ticTacToe.isWinPositionForDiagonalsTest();
        ticTacToe.isDrawPositionTest();
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
        int[][] field1 = {
                {0, 1, 1},
                {1, 1, 0},
                {0, 1, 0},};
        int[][] field2 = {
                {0, 0, 1},
                {1, 0, 0},
                {1, -1, 1},};

        TicTacToe ticTacToe = new TicTacToe();

        if (!ticTacToe.isDrawPosition(field1) &&
                ticTacToe.isDrawPosition(field2)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
