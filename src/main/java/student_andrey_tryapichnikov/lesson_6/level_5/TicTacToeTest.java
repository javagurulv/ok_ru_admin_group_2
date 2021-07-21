package student_andrey_tryapichnikov.lesson_6.level_5;

import student_andrey_tryapichnikov.boilerplate.BoilerplateStatic;

public class TicTacToeTest {
    public static void main(String[] args) {
        int[][] testField = {{ 1,  0,  0},
                             { 1,  1,  1},
                             {-1,  1,  0}};
        testHor(testField, 1);
        testAny(testField, 1);
        testField[1][1] = 0;
        testHor(testField, 1);
        testAny(testField, 1);
        testField[1][2] = 0;
        testVer(testField, 0);
        testAny(testField, 0);
        testField[1][2] = 1;
        testVer(testField, 0);
        testAny(testField, 0);
        testField[0][0] = 0;
        testDia(testField, 1);
        testDia(testField, 0);
        testField[0][2] = 1;
        testField[1][0] = -1;
        testField[1][1] = 1;
        testField[2][0] = 1;
        testAny(testField, 1);
    }
    static void testHor(int[][] field, int player) {
        var ticTacToe = new TicTacToe(field);
        String playerId;
        ticTacToe.printField();
        var result = ticTacToe.isWinPositionForHorizontals(player);
        switch (player) {
            case 0 -> playerId = "x";
            case 1 -> playerId = "o";
            default -> playerId = "N/A";
        }
        BoilerplateStatic.printTestResult(result, "Horizontal: player %s OK\n", "Horizontal: player %s FAIL\n", playerId);
    }
    static void testVer(int[][] field, int player) {
        var ticTacToe = new TicTacToe(field);
        String playerId;
        ticTacToe.printField();
        var result = ticTacToe.isWinPositionForVerticals(player);
        switch (player) {
            case 0 -> playerId = "x";
            case 1 -> playerId = "o";
            default -> playerId = "N/A";
        }
        BoilerplateStatic.printTestResult(result, "Vertical: player %s OK\n", "Vertical: player %s FAIL\n", playerId);
    }
    static void testDia(int[][] field, int player) {
        var ticTacToe = new TicTacToe(field);
        String playerId;
        ticTacToe.printField();
        var result = ticTacToe.isWinPositionForDiagonals(player);
        switch (player) {
            case 0 -> playerId = "x";
            case 1 -> playerId = "o";
            default -> playerId = "N/A";
        }
        BoilerplateStatic.printTestResult(result, "Diagonal: player %s OK\n", "Diagonal: player %s FAIL\n", playerId);
    }
    static void testAny(int[][] field, int player) {
        var ticTacToe = new TicTacToe(field);
        String playerId;
        ticTacToe.printField();
        var result = ticTacToe.isWinPosition(player);
        switch (player) {
            case 0 -> playerId = "x";
            case 1 -> playerId = "o";
            default -> playerId = "N/A";
        }
        BoilerplateStatic.printTestResult(result, "Any: player %s OK\n", "Any: player %s FAIL\n", playerId);
    }
}
