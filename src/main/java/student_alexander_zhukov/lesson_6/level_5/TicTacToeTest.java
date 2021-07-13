package student_alexander_zhukov.lesson_6.level_5;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest newTest = new TicTacToeTest();
        int[][] arr = new int[][] {{1,1,1}, {0,0,-1}, {-1,0,-1}};
        int[][] arr1 = new int[][] {{1,1,0}, {1,0,0}, {1,0,-1}};
        int[][] arr2 = new int[][] {{-1,1,0}, {-1,0,1}, {0,-1,1}};
        int[][] arrDraw = new int[][] {{1,1,0}, {0,0,1}, {1,0,0}};

        newTest.isWinPositionForHorizontalsTest(arr, 1, true);
        newTest.isWinPositionForHorizontalsTest(arr, 0, false);

        newTest.isWinPositionForVerticalsTest(arr1, 1, true);
        newTest.isWinPositionForVerticalsTest(arr1, 0, false);

        newTest.isWinPositionForDiagonalsTest(arr2, 1, false);
        newTest.isWinPositionForDiagonalsTest(arr2, 0, true);

        newTest.isWinPositionTest(arr, 1, true);
        newTest.isWinPositionTest(arr, 0, false);
        newTest.isWinPositionTest(arr1, 1, true);
        newTest.isWinPositionTest(arr1, 0, false);
        newTest.isWinPositionTest(arr2, 1, false);
        newTest.isWinPositionTest(arr2, 0, true);

        newTest.isDrawPositionTest(arrDraw, true);
        newTest.isDrawPositionTest(arr, false);

    }

    public void isWinPositionForHorizontalsTest(int[][] array, int playerToCheck, boolean answer) {
        TicTacToe horizontalsTest = new TicTacToe();
        boolean result = horizontalsTest.isWinPositionForHorizontals(array, playerToCheck);
        checkTestResult(result == answer, playerToCheck, "isWinPositionForHorizontalsTest");
    }

    public void isWinPositionForVerticalsTest(int[][] array, int playerToCheck, boolean answer) {
        TicTacToe verticalsTest = new TicTacToe();
        boolean result = verticalsTest.isWinPositionForVerticals(array, playerToCheck);
        checkTestResult(result == answer, playerToCheck, "isWinPositionForVerticalsTest");
    }

    public void isWinPositionForDiagonalsTest(int[][] array, int playerToCheck, boolean answer) {
        TicTacToe diagonalsTest = new TicTacToe();
        boolean result = diagonalsTest.isWinPositionForDiagonals(array, playerToCheck);
        checkTestResult(result == answer, playerToCheck, "isWinPositionForDiagonalsTest");
    }

    public void isWinPositionTest(int[][] array, int playerToCheck, boolean answer) {
        TicTacToe winTest = new TicTacToe();
        boolean result = winTest.isWinPosition(array, playerToCheck);
        checkTestResult(result == answer, playerToCheck, "isWinPositionTest");
    }

    public void isDrawPositionTest(int[][] array, boolean answer) {
        TicTacToe drawTest = new TicTacToe();
        boolean result = drawTest.isDrawPosition(array);
        checkTestResult(result == answer, 10,"isDrawPositionTest");
    }

    private void checkTestResult(boolean condition, int playerToCheck, String testName) {
        if (condition) {
            System.out.println(testName + " playerToCheck " + playerToCheck + " = OK!");
        } else {
            System.out.println(testName + " playerToCheck " + playerToCheck + " = FAIL!");
        }
    }
}
