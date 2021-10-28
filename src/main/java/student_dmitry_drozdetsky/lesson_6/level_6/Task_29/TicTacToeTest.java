package student_dmitry_drozdetsky.lesson_6.level_6.Task_29;

import java.util.Arrays;

public class TicTacToeTest {
    public static void main(String[] args) {
        isWinPositionForHorizontalsTest1();
        isWinPositionForHorizontalsTest2();
        isWinPositionForVerticalsTest1();
        isWinPositionForVerticalsTest2();
        isWinPositionForDiagonalsTest1();
        isWinPositionForDiagonalsTest2();
        isWinPositionForDiagonalsTest3();
        isWinPositionTest1();
        isWinPositionTest2();
        isWinPositionTest3();
        isWinPositionTest4();
        isDrawPositionTest1();
        isDrawPositionTest2();
        isDrawPositionTest3();
        createFieldTest();
    }

    private static void checkTestResult(String testName, boolean testResult) {
        if (testResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    private static void isWinPositionForHorizontalsTest1() {
        int[][] testState = new int[][] {
                {-1, 1, -1},
                {0, 0, 0},
                {-1, 1, -1}
        };
        boolean expectedResult = true;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(testState, 0);

        checkTestResult("Win Position For Horizontals (0 - player, positive)",
                realResult == expectedResult);
    }

    private static void isWinPositionForHorizontalsTest2() {
        int[][] testState = new int[][] {
                {-1, 1, -1},
                {0, 0, 0},
                {-1, 1, -1}
        };
        boolean expectedResult = false;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(testState, 1);

        checkTestResult("Win Position For Horizontals (1 - player, negative)",
                realResult == expectedResult);
    }

    private static void isWinPositionForVerticalsTest1() {
        int[][] testState = new int[][] {
                {-1, 0, -1},
                {1, 0, 1},
                {-1, 0, -1}
        };
        boolean expectedResult = true;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(testState, 0);

        checkTestResult("Win Position For Verticals (0 - player, positive)",
                realResult == expectedResult);
    }

    private static void isWinPositionForVerticalsTest2() {
        int[][] testState = new int[][] {
                {-1, 0, -1},
                {1, 0, 1},
                {-1, 0, -1}
        };
        boolean expectedResult = false;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(testState, 1);

        checkTestResult("Win Position For Verticals (1 - player, negative)",
                realResult == expectedResult);
    }

    private static void isWinPositionForDiagonalsTest1() {
        int[][] testState = new int[][] {
                {0, -1, -1},
                {1, 0, 1},
                {-1, -1, 0}
        };
        boolean expectedResult = true;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(testState, 0);

        checkTestResult("Win Position For Diagonals (0 - player, descending)",
                realResult == expectedResult);
    }

    private static void isWinPositionForDiagonalsTest2() {
        int[][] testState = new int[][] {
                {-1, -1, 0},
                {1, 0, 1},
                {0, -1, -1}
        };
        boolean expectedResult = true;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(testState, 0);

        checkTestResult("Win Position For Diagonals (0 - player, ascending)",
                realResult == expectedResult);
    }

    private static void isWinPositionForDiagonalsTest3() {
        int[][] testState = new int[][] {
                {-1, -1, 0},
                {1, 0, 1},
                {0, -1, -1}
        };
        boolean expectedResult = false;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(testState, 1);

        checkTestResult("Win Position For Diagonals (1 - player, negative)",
                realResult == expectedResult);
    }

    private static void isWinPositionTest1() {
        int[][] testState = new int[][] {
                {0, 0, 0},
                {1, -1, 1},
                {-1, -1, -1}
        };
        boolean expectedResult = true;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(testState, 0);

        checkTestResult("Win Position (0 - player, horizontal)",
                realResult == expectedResult);
    }

    private static void isWinPositionTest2() {
        int[][] testState = new int[][] {
                {-1, 0, -1},
                {1, 0, 1},
                {-1, 0, -1}
        };
        boolean expectedResult = true;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(testState, 0);

        checkTestResult("Win Position (0 - player, vertical)",
                realResult == expectedResult);
    }

    private static void isWinPositionTest3() {
        int[][] testState = new int[][] {
                {0, -1, -1},
                {1, 0, 1},
                {-1, -1, 0}
        };
        boolean expectedResult = true;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(testState, 0);

        checkTestResult("Win Position (0 - player, diagonal)",
                realResult == expectedResult);
    }

    private static void isWinPositionTest4() {
        int[][] testState = new int[][] {
                {1, -1, -1},
                {1, 0, 1},
                {-1, -1, 0}
        };
        boolean expectedResult = false;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(testState, 0);

        checkTestResult("Win Position (0 - player, negative)",
                realResult == expectedResult);
    }

    private static void isDrawPositionTest1() {
        int[][] testState = new int[][] {
                {0, -1, -1},
                {1, 0, 1},
                {-1, -1, 0}
        };
        boolean expectedResult = false;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(testState);

        checkTestResult("Draw Position (player 0 win)",
                realResult == expectedResult);
    }

    private static void isDrawPositionTest2() {
        int[][] testState = new int[][] {
                {-1, 1, 0},
                {1, 0, 1},
                {1, 0, -1}
        };
        boolean expectedResult = false;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(testState);

        checkTestResult("Draw Position (has empty)",
                realResult == expectedResult);
    }

    private static void isDrawPositionTest3() {
        int[][] testState = new int[][] {
                {0, 1, 0},
                {1, 0, 1},
                {1, 0, 1}
        };
        boolean expectedResult = true;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(testState);

        checkTestResult("Draw Position (is draw)",
                realResult == expectedResult);
    }

    private static void createFieldTest() {
        int[][] expectedField = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };

        TicTacToe ticTacToe = new TicTacToe();
        int[][] realField = ticTacToe.createField();

        checkTestResult("Create Field",
                Arrays.deepEquals(realField, expectedField));
    }
}
