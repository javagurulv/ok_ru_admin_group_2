package student_andrey_domas.lesson_8_single_responsibility_principle_optional;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game.Ball;
import student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game.Column;
import student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game.PlayingField;

public class GameTest {

    PlayingField pf;

    @Before
    public void setup() {
        pf = new PlayingField(7, 6);
    }

    // 0 - no ball
    // 1 - green
    // 2 - red
    private void setupPlayingField(int[] balls) {
        Column[] columns = pf.getColumns();
        for (int i = balls.length - 1; i >= 0; i--) {
            int cidx = i % 7;
            if (balls[i] == 1)
                columns[cidx].putBall(new Ball(Ball.GREEN));
            else if (balls[i] == 2)
                columns[cidx].putBall(new Ball(Ball.RED));
        }
    }

    @Test
    public void testNoWinPosition() {
        int balls[] = {
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
        };
        setupPlayingField(balls);

        assertNull( pf.isWinPosition());
    }

    @Test
    public void testWinPositionVertical1() {
        int balls[] = {
                0, 0, 0, 0, 0, 0, 1,
                0, 0, 0, 0, 0, 0, 1,
                0, 0, 0, 0, 0, 0, 2,
                2, 0, 0, 0, 0, 0, 2,
                2, 0, 1, 0, 0, 0, 2,
                2, 0, 1, 1, 0, 0, 2,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionVertical();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.RED, ball.getColor());
    }

    @Test
    public void testWinPositionVertical2() {
        int balls[] = {
                1, 0, 0, 0, 0, 0, 0,
                1, 0, 0, 0, 0, 0, 0,
                1, 0, 0, 0, 0, 0, 0,
                1, 0, 0, 0, 0, 0, 2,
                2, 0, 0, 0, 0, 0, 2,
                2, 0, 0, 0, 0, 0, 2,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionVertical();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.GREEN, ball.getColor());
    }

    @Test
    public void testWinPositionVertical3() {
        int balls[] = {
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 2, 0, 0, 0,
                1, 0, 0, 2, 0, 0, 0,
                1, 0, 1, 2, 1, 0, 2,
                2, 0, 2, 2, 1, 0, 2,
                2, 0, 1, 1, 1, 0, 2,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionVertical();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.RED, ball.getColor());
    }

    @Test
    public void testWinPositionHorizontal1() {
        int balls[] = {
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                1, 0, 0, 0, 0, 0, 0,
                1, 1, 1, 1, 2, 0, 2,
                2, 0, 2, 2, 1, 0, 2,
                2, 0, 1, 1, 1, 0, 2,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionHorizontal();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.GREEN, ball.getColor());
    }

    @Test
    public void testWinPositionHorizontal2() {
        int balls[] = {
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                1, 0, 0, 0, 0, 0, 0,
                1, 0, 1, 1, 2, 0, 2,
                2, 0, 2, 2, 1, 0, 2,
                2, 0, 1, 2, 2, 2, 2,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionHorizontal();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.RED, ball.getColor());
    }

    @Test
    public void testWinPositionHorizontal3() {
        int balls[] = {
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                1, 0, 0, 0, 0, 0, 0,
                1, 0, 1, 1, 1, 1, 2,
                2, 0, 2, 2, 1, 2, 2,
                2, 0, 1, 1, 2, 2, 2,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionHorizontal();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.GREEN, ball.getColor());
    }

    @Test
    public void testWinPositionDiagonal1() {
        int balls[] = {
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                1, 0, 0, 0, 0, 0, 1,
                1, 0, 0, 0, 1, 1, 2,
                2, 0, 2, 2, 1, 2, 2,
                2, 2, 1, 1, 2, 2, 2,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionDiagonal();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.GREEN, ball.getColor());
    }

    @Test
    public void testWinPositionDiagonal2() {
        int balls[] = {
                0, 0, 0, 0, 0, 0, 2,
                0, 0, 0, 0, 0, 2, 2,
                1, 0, 0, 0, 2, 1, 1,
                1, 0, 0, 2, 1, 2, 2,
                2, 0, 0, 2, 1, 2, 2,
                2, 2, 1, 1, 2, 2, 2,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionDiagonal();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.RED, ball.getColor());
    }

    @Test
    public void testWinPositionDiagonal3() {
        int balls[] = {
                0, 0, 0, 1, 0, 0, 0,
                0, 0, 1, 2, 0, 0, 0,
                1, 1, 2, 1, 0, 0, 0,
                1, 1, 2, 2, 0, 0, 2,
                2, 2, 2, 1, 1, 2, 2,
                2, 2, 1, 1, 2, 2, 2,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionDiagonal();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.GREEN, ball.getColor());
    }

    @Test
    public void testWinPositionDiagonal4() {
        int balls[] = {
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 2, 0, 0, 0,
                0, 0, 0, 1, 2, 0, 2,
                2, 2, 2, 1, 1, 2, 2,
                2, 2, 1, 1, 2, 2, 2,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionDiagonal();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.RED, ball.getColor());
    }

    @Test
    public void testWinPositionDiagonal5() {
        int balls[] = {
                1, 0, 0, 0, 0, 0, 0,
                2, 1, 0, 0, 0, 0, 0,
                1, 1, 1, 0, 0, 0, 0,
                2, 2, 1, 1, 2, 0, 2,
                2, 2, 2, 1, 2, 2, 2,
                2, 2, 1, 1, 2, 2, 2,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionDiagonal();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.GREEN, ball.getColor());
    }

    @Test
    public void testWinPositionDiagonal6() {
        int balls[] = {
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                2, 0, 0, 0, 0, 0, 0,
                1, 2, 0, 0, 0, 0, 0,
                2, 1, 2, 0, 0, 0, 0,
                1, 1, 1, 2, 0, 0, 0,
        };
        setupPlayingField(balls);

        Ball[] winBalls = pf.isWinPositionDiagonal();
        assertNotNull(winBalls);
        assertEquals(PlayingField.WIN_SEQENCE, winBalls.length);
        assertArrayEquals(winBalls, pf.isWinPosition());
        for (Ball ball: winBalls)
            assertEquals(Ball.RED, ball.getColor());
    }
}
