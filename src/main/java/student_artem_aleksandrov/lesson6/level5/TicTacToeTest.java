package student_artem_aleksandrov.lesson6.level5;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();

        ticTacToeTest.isWinPositionForHorizontalsTest();
        ticTacToeTest.isWinPositionForVerticalsTest();
        ticTacToeTest.isWinPositionForDiagonalsTest();
        ticTacToeTest.isWinPositionTest();
//        ticTacToeTest.isDrawPositionTest();

    }

    public void isWinPositionForHorizontalsTest() {
        int [][] field = { {1,0,1},{0,1,1},{0,0,0} };
        TicTacToe ticTacToe = new TicTacToe();
        if (ticTacToe.isWinPositionForHorizontals(field, 0)) {
            Ok();
        } else {
            Fail();
        }

        if (! ticTacToe.isWinPositionForHorizontals(field, 1)) {
            Ok();
        } else {
            Fail();
        }

    }

    public void isWinPositionForVerticalsTest() {
        int [][] field = { {1,0,1},{0,0,1},{0,0,0} };
        TicTacToe ticTacToe = new TicTacToe();
        if (ticTacToe.isWinPositionForVerticals(field, 0)) {
            Ok();
        } else {
            Fail();
        }

        if (! ticTacToe.isWinPositionForVerticals(field, 1)) {
            Ok();
        } else {
            Fail();
        }

    }

    public void isWinPositionForDiagonalsTest() {
        int [][] field = { {1,0,0},{0,0,1},{0,0,0} };
        TicTacToe ticTacToe = new TicTacToe();
        if (ticTacToe.isWinPositionForDiagonals(field, 0)) {
            Ok();
        } else {
            Fail();
        }

        if (! ticTacToe.isWinPositionForDiagonals(field, 1)) {
            Ok();
        } else {
            Fail();
        }
    }

    public void isWinPositionTest() {
        int [][] field = { {1,0,0},{0,0,1},{0,0,0} };
        TicTacToe ticTacToe = new TicTacToe();
        if (ticTacToe.isWinPosition(field, 0)) {
            Ok();
        } else {
            Fail();
        }

        if (! ticTacToe.isWinPosition(field, 1)) {
            Ok();
        } else {
            Fail();
        }
    }

//    public void isDrawPositionTest() {
//        int [][] field = { {1,0,0},{0,0,1},{0,1,0} };
//        TicTacToe ticTacToe = new TicTacToe();
//        if (ticTacToe.isDrawPosition(field)) {
//            Ok();
//        }
//
//        int [][] field2 = { {1,0,0},{0,0,1},{0,-1,0} };
//        if (ticTacToe.isDrawPosition(field2)) {
//            Fail();
//        }
//
//        int [][] field3 = { {1,0,0},{0,0,1},{0,0,0} };
//        if (ticTacToe.isDrawPosition(field3)) {
//            Fail();
//            ticTacToe.field = field3;
//            ticTacToe.printField();
//        }
//
//        int [][] field4 = { {1,0,1},{0,0,1},{0,1,0} };
//        if (ticTacToe.isDrawPosition(field4)) {
//            Ok();
//        }
//    }
    public void Fail() {
        System.out.println("Test Failed");
    }

    public void Ok() {
        System.out.println("Test Ok");
    }
}
