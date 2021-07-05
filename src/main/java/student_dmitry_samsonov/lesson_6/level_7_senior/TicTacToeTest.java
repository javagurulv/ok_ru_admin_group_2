package student_dmitry_samsonov.lesson_6.level_7_senior;

import java.util.Arrays;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.isWinPositionForHorizontalsTest();
        ticTacToeTest.isWinPositionForVerticalsTest();
        ticTacToeTest.isWinPositionForDiagonalsTest();
        ticTacToeTest.isWinPositionForDiagonals2Test();
        ticTacToeTest.isWinPositionTest();
        ticTacToeTest.isFieldFilledTest();
        ticTacToeTest.isDrawPositionTest();
        ticTacToeTest.createFieldTest();
    }
    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }
    void isWinPositionForHorizontalsTest() {
        int[][] field = {{0, 0, 1},{0, 0, 0},{0, 1, 0}};
        TicTacToe ticTacToe = new TicTacToe();
        printTestResult("isWinPositionForHorizontals", ticTacToe.isWinPositionForHorizontals(field, 0));
    }
    void isWinPositionForVerticalsTest() {
        int[][] field = {{0, 0, 1},{0, 1, 0},{0, 1, 0}};
        TicTacToe ticTacToe = new TicTacToe();
        printTestResult("isWinPositionForVerticals", ticTacToe.isWinPositionForVerticals(field, 0));
    }
    void isWinPositionForDiagonalsTest() {
        int[][] field = {{1, 0, 1},{0, 1, 0},{0, 1, 1}};
        TicTacToe ticTacToe = new TicTacToe();
        printTestResult("isWinPositionForDiagonals forward", ticTacToe.isWinPositionForDiagonals(field, 1));
    }
    void isWinPositionForDiagonals2Test() {
        int[][] field = {{0, 0, 1},{0, 1, 0},{1, 1, 0}};
        TicTacToe ticTacToe = new TicTacToe();
        printTestResult("isWinPositionForDiagonals backward", ticTacToe.isWinPositionForDiagonals(field, 1));
    }
    void isWinPositionTest(){
        int[][] field = {{0, 0, 1},{0, 1, 0},{1, 1, 0}};
        TicTacToe ticTacToe = new TicTacToe();
        printTestResult("isWinPosition", ticTacToe.isWinPosition(field, 1));
    }
    void isFieldFilledTest(){
        int[][] field = {{0, 0, 0},{-1, 0, 0},{1, 1, 0}};
        TicTacToe ticTacToe = new TicTacToe();
        printTestResult("isFieldFilled", !ticTacToe.isFieldFilled(field));
    }
    void isDrawPositionTest(){
        int[][] field = {{0, 1, 0},{1, 1, 0},{0, 0, 1}};
        TicTacToe ticTacToe = new TicTacToe();
        printTestResult("isDrawPosition", ticTacToe.isDrawPosition(field));
    }
    void createFieldTest(){
        int[][] field = {{-1, -1, -1},{-1, -1, -1},{-1, -1, -1}};
        TicTacToe ticTacToe = new TicTacToe();
        printTestResult("createField", Arrays.deepEquals(ticTacToe.createField(), field));
    }
}
