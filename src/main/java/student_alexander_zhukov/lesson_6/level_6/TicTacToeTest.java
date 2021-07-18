package student_alexander_zhukov.lesson_6.level_6;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest newTest = new TicTacToeTest();
        int[][] arr = new int[][] {{1,1,1}, {0,0,-1}, {-1,0,-1}};
        int[][] arr1 = new int[][] {{1,1,0}, {1,0,0}, {1,0,-1}};
        int[][] arr2 = new int[][] {{-1,1,0}, {-1,0,1}, {0,-1,1}};
        int[][] arrDraw = new int[][] {{1,1,0}, {0,0,1}, {1,0,0}};

        newTest.isWinPositionForHorizontalsTest(arr, 1, true, 1);
        newTest.isWinPositionForHorizontalsTest(arr, 0, false, 2);

        newTest.isWinPositionForVerticalsTest(arr1, 1, true, 1);
        newTest.isWinPositionForVerticalsTest(arr1, 0, false, 2);

        newTest.isWinPositionForDiagonalsTest(arr2, 1, false, 1);
        newTest.isWinPositionForDiagonalsTest(arr2, 0, true, 2);

        newTest.isWinPositionTest(arr, 1, true, 1);
        newTest.isWinPositionTest(arr, 0, false, 2);
        newTest.isWinPositionTest(arr1, 1, true, 3);
        newTest.isWinPositionTest(arr1, 0, false, 4);
        newTest.isWinPositionTest(arr2, 1, false, 5);
        newTest.isWinPositionTest(arr2, 0, true, 6);

        newTest.isDrawPositionTest(arrDraw, true, 1);
        newTest.isDrawPositionTest(arr, false, 2);

        newTest.createFieldTest(2);

    }

    public void isWinPositionForHorizontalsTest(int[][] array, int playerToCheck, boolean answer, int numTest) {
        TicTacToe horizontalsTest = new TicTacToe();
        boolean result = horizontalsTest.isWinPositionForHorizontals(array, playerToCheck);
        checkTestResult(result == answer, numTest, "isWinPositionForHorizontalsTest");
    }

    public void isWinPositionForVerticalsTest(int[][] array, int playerToCheck, boolean answer, int numTest) {
        TicTacToe verticalsTest = new TicTacToe();
        boolean result = verticalsTest.isWinPositionForVerticals(array, playerToCheck);
        checkTestResult(result == answer, numTest, "isWinPositionForVerticalsTest");
    }

    public void isWinPositionForDiagonalsTest(int[][] array, int playerToCheck, boolean answer, int numTest) {
        TicTacToe diagonalsTest = new TicTacToe();
        boolean result = diagonalsTest.isWinPositionForDiagonals(array, playerToCheck);
        checkTestResult(result == answer, numTest, "isWinPositionForDiagonalsTest");
    }

    public void isWinPositionTest(int[][] array, int playerToCheck, boolean answer, int numTest) {
        TicTacToe winTest = new TicTacToe();
        boolean result = winTest.isWinPosition(array, playerToCheck);
        checkTestResult(result == answer, numTest, "isWinPositionTest");
    }

    public void isDrawPositionTest(int[][] array, boolean answer, int numTest) {
        TicTacToe drawTest = new TicTacToe();
        boolean result = drawTest.isDrawPosition(array);
        checkTestResult(result == answer, numTest,"isDrawPositionTest");
    }

    public void createFieldTest(int numTest) {
        TicTacToe createTest = new TicTacToe();
        int[][] needArray = new int[][] {{-1,-1,-1}, {-1,-1,-1}, {-1,-1,-1}};
        int[][] newArray = createTest.createField();
        createTest.printFieldToConsole(newArray);
        checkTestResult(Arrays.deepEquals(needArray, newArray), numTest,"createFieldTest");
    }

    private void checkTestResult(boolean condition, int numTest, String testName) {
        if (condition) {
            System.out.println(testName + " playerToCheck " + numTest + " = OK!");
        } else {
            System.out.println(testName + " playerToCheck " + numTest + " = FAIL!");
        }
    }
}
