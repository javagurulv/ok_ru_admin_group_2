package student_andrey_domas.lesson6.level5;

import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {

    private TicTacToe game;

    @Before
    public void setup() {
        game = new TicTacToe();
    }

    @Test
    public void createFieldTest() {
        int field[][] = game.createField();
        int i = 0;
        int j = 0;
        for (i = 0; i < field.length; i++)
            for (j = 0; j < field[i].length; j++)
                assert field[i][j] == -1;

        assert i == j;
    }

    @Test
    public void horizontalTestOneWin() {
        int field[][] = {
                {-1, 1, 0},
                {1, 1, 1},
                {1, 0, 0},
        };
        assert game.isWinPositionForHorizontals(field, 1);
        assert !game.isWinPositionForHorizontals(field, -1);
        assert !game.isWinPositionForHorizontals(field, 0);
        assert !game.isWinPositionForDiagonals(field, -1);
        assert !game.isWinPositionForDiagonals(field, 0);
        assert !game.isWinPositionForDiagonals(field, 1);

        assert game.isWinPosition(field, 1);
        assert !game.isWinPosition(field, 0);
        assert !game.isWinPosition(field, -1);

        assert !game.isDrawPosition(field);
    }

    @Test
    public void horizontalTestZeroWin() {
        int field[][] = {
                {-1, 1, 0},
                {0, 1, 1},
                {0, 0, 0},
        };
        assert game.isWinPositionForHorizontals(field, 0);
        assert !game.isWinPositionForHorizontals(field, 1);
        assert !game.isWinPositionForHorizontals(field, -1);
        assert !game.isWinPositionForDiagonals(field, -1);
        assert !game.isWinPositionForDiagonals(field, 0);
        assert !game.isWinPositionForDiagonals(field, 1);

        assert game.isWinPosition(field, 0);
        assert !game.isWinPosition(field, 1);
        assert !game.isWinPosition(field, -1);

        assert !game.isDrawPosition(field);
    }

    @Test
    public void horizontalTestEmptyWin() {
        int field[][] = {
                {-1, -1, -1},
                {1, 0, 1},
                {1, -1, 0},
        };
        assert game.isWinPositionForHorizontals(field, -1);
        assert !game.isWinPositionForHorizontals(field, 1);
        assert !game.isWinPositionForHorizontals(field, 0);
        assert !game.isWinPositionForDiagonals(field, -1);
        assert !game.isWinPositionForDiagonals(field, 0);
        assert !game.isWinPositionForDiagonals(field, 1);

        assert game.isWinPosition(field, -1);
        assert !game.isWinPosition(field, 0);
        assert !game.isWinPosition(field, 1);

        assert !game.isDrawPosition(field);
    }

    @Test
    public void verticalTestOneWin() {
        int field[][] = {
                {1, -1, 0},
                {1, 0, 1},
                {1, -1, -1},
        };
        assert game.isWinPositionForVerticals(field, 1);
        assert !game.isWinPositionForVerticals(field, -1);
        assert !game.isWinPositionForVerticals(field, 0);
        assert !game.isWinPositionForDiagonals(field, -1);
        assert !game.isWinPositionForDiagonals(field, 0);
        assert !game.isWinPositionForDiagonals(field, 1);

        assert game.isWinPosition(field, 1);
        assert !game.isWinPosition(field, 0);
        assert !game.isWinPosition(field, -1);

        assert !game.isDrawPosition(field);
    }

    @Test
    public void verticalTestZeroWin() {
        int field[][] = {
                {0, 0, 1},
                {-1, 0, -1},
                {1, 0, 1},
        };
        assert game.isWinPositionForVerticals(field, 0);
        assert !game.isWinPositionForVerticals(field, -1);
        assert !game.isWinPositionForVerticals(field, 1);
        assert !game.isWinPositionForDiagonals(field, -1);
        assert !game.isWinPositionForDiagonals(field, 0);
        assert !game.isWinPositionForDiagonals(field, 1);

        assert game.isWinPosition(field, 0);
        assert !game.isWinPosition(field, 1);
        assert !game.isWinPosition(field, -1);

        assert !game.isDrawPosition(field);
    }

    @Test
    public void verticalTestEmptyWin() {
        int field[][] = {
                {1, -1, -1},
                {-1, 0, -1},
                {1, -1, -1},
        };
        assert game.isWinPositionForVerticals(field, -1);
        assert !game.isWinPositionForVerticals(field, 1);
        assert !game.isWinPositionForVerticals(field, 0);
        assert !game.isWinPositionForDiagonals(field, -1);
        assert !game.isWinPositionForDiagonals(field, 0);
        assert !game.isWinPositionForDiagonals(field, 1);

        assert game.isWinPosition(field, -1);
        assert !game.isWinPosition(field, 0);
        assert !game.isWinPosition(field, 1);

        assert !game.isDrawPosition(field);
    }

    @Test
    public void diagonalTestOneWinOne() {
        int field[][] = {
                {1, -1, 0},
                {-1, 1, 1},
                {1, 0, 1},
        };
        assert !game.isWinPositionForVerticals(field, 1);
        assert !game.isWinPositionForVerticals(field, -1);
        assert !game.isWinPositionForVerticals(field, 0);
        assert !game.isWinPositionForVerticals(field, 1);
        assert !game.isWinPositionForVerticals(field, -1);
        assert !game.isWinPositionForVerticals(field, 0);
        assert !game.isWinPositionForDiagonals(field, -1);
        assert !game.isWinPositionForDiagonals(field, 0);
        assert game.isWinPositionForDiagonals(field, 1);

        assert game.isWinPosition(field, 1);
        assert !game.isWinPosition(field, 0);
        assert !game.isWinPosition(field, -1);

        assert !game.isDrawPosition(field);
    }

    @Test
    public void diagonalTestTwoWinZero() {
        int field[][] = {
                {0, -1, 1},
                {-1, 0, 0},
                {1, 0, 0},
        };
        assert !game.isWinPositionForVerticals(field, 1);
        assert !game.isWinPositionForVerticals(field, -1);
        assert !game.isWinPositionForVerticals(field, 0);
        assert !game.isWinPositionForVerticals(field, 1);
        assert !game.isWinPositionForVerticals(field, -1);
        assert !game.isWinPositionForVerticals(field, 0);
        assert !game.isWinPositionForDiagonals(field, -1);
        assert game.isWinPositionForDiagonals(field, 0);
        assert !game.isWinPositionForDiagonals(field, 1);

        assert game.isWinPosition(field, 0);
        assert !game.isWinPosition(field, 1);
        assert !game.isWinPosition(field, -1);

        assert !game.isDrawPosition(field);
    }

    @Test
    public void testNoOneWin() {
        int field[][] = {
                {1, 1, 0},
                {0, 0, 1},
                {1, 0, 0},
        };
        assert !game.isWinPositionForVerticals(field, 1);
        assert !game.isWinPositionForVerticals(field, -1);
        assert !game.isWinPositionForVerticals(field, 0);
        assert !game.isWinPositionForVerticals(field, 1);
        assert !game.isWinPositionForVerticals(field, -1);
        assert !game.isWinPositionForVerticals(field, 0);
        assert !game.isWinPositionForDiagonals(field, -1);
        assert !game.isWinPositionForDiagonals(field, 0);
        assert !game.isWinPositionForDiagonals(field, 1);

        assert !game.isWinPosition(field, 1);
        assert !game.isWinPosition(field, -1);
        assert !game.isWinPosition(field, 0);

        assert game.isDrawPosition(field);
    }

    @Test
    public void testNoOneWinNotDraw() {
        int field[][] = {
                {1, 1, 0},
                {0, -1, 1},
                {1, 0, 0},
        };
        assert !game.isWinPositionForVerticals(field, 1);
        assert !game.isWinPositionForVerticals(field, -1);
        assert !game.isWinPositionForVerticals(field, 0);
        assert !game.isWinPositionForVerticals(field, 1);
        assert !game.isWinPositionForVerticals(field, -1);
        assert !game.isWinPositionForVerticals(field, 0);
        assert !game.isWinPositionForDiagonals(field, -1);
        assert !game.isWinPositionForDiagonals(field, 0);
        assert !game.isWinPositionForDiagonals(field, 1);

        assert !game.isWinPosition(field, 1);
        assert !game.isWinPosition(field, -1);
        assert !game.isWinPosition(field, 0);

        assert !game.isDrawPosition(field);
    }

}
