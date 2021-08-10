package student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game;

import java.util.Objects;

public class PlayingField {

    private int lines;
    private Column[] columns;

    public static final int WIN_SEQENCE = 4;

    public PlayingField(int columns, int lines) {
        this.lines = lines;
        this.columns = new Column[columns];
        for (int i = 0; i < columns; i++) {
            this.columns[i] = new Column(lines);
        }
    }

    public Column[] getColumns() {
        return columns;
    }

    // returns array with winning Balls or null
    public Ball[] isWinPositionVertical() {
        for (Column column: columns) {
            Ball[] balls = column.getStack();
            for (int i = 0; i < balls.length; i++) {
                if (Objects.isNull(balls[i]) || i + WIN_SEQENCE - 1 >= balls.length)
                    break;
                Ball winBalls[] = new Ball[WIN_SEQENCE];
                winBalls[0] = balls[i];
                for (int j= i + 1; j <= i + WIN_SEQENCE - 1; j++) {
                    if (!balls[i].equals(balls[j]))
                        break;
                    else {
                        winBalls[j - i] = balls[j];
                        if (j - i == WIN_SEQENCE - 1)
                            return winBalls;
                    }
                }
            }
        }
        return null;
    }

    // returns array with winning Balls or null
    public Ball[] isWinPositionHorizontal() {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j <= columns.length; j++) {
                if (j + WIN_SEQENCE - 1 >= columns.length)
                    break;
                Ball ball1 = columns[j].getStack()[i];
                if (Objects.isNull(ball1))
                    continue;
                Ball winBalls[] = new Ball[WIN_SEQENCE];
                winBalls[0] = ball1;
                for (int j2 = j + 1; j2 <= j + WIN_SEQENCE -1; j2++) {
                    Ball ball2 = columns[j2].getStack()[i];
                    if (!ball1.equals(ball2))
                        break;
                    else {
                        winBalls[j2 - j] = ball2;
                        if (j2 - j == WIN_SEQENCE - 1)
                            return winBalls;
                    }
                }
            }
        }
        return null;
    }

    // returns array with winning Balls or null
    public Ball[] isWinPositionDiagonal() {
        for (int i = 0; i <= columns.length - WIN_SEQENCE + 1; i++) {
            Ball balls[] = columns[i].getStack();
            for (int j = 0; j <= balls.length; j++) {
                if (j + WIN_SEQENCE - 1 >= balls.length || i + WIN_SEQENCE - 1 >= columns.length)
                    break;
                Ball ball = balls[j];
                if (Objects.isNull(ball))
                    break;
                Ball winBalls[] = new Ball[WIN_SEQENCE];
                winBalls[0] = ball;
                for (int offset = 1; offset <= WIN_SEQENCE - 1; offset++) {
                    Ball diagonalBall = columns[i + offset].getStack()[j + offset];
                    if (!ball.equals(diagonalBall))
                        break;
                    else {
                        winBalls[offset] = diagonalBall;
                        if (offset == WIN_SEQENCE - 1)
                            return winBalls;
                    }
                }
            }
        }

        for (int i = columns.length - 1; i >= WIN_SEQENCE - 1; i--) {
            Ball balls[] = columns[i].getStack();
            for (int j = 0; j <= balls.length; j++) {
                if (j + WIN_SEQENCE - 1 >= balls.length)
                    break;
                Ball ball = balls[j];
                if (Objects.isNull(ball))
                    break;
                Ball winBalls[] = new Ball[WIN_SEQENCE];
                winBalls[0] = ball;
                for (int offset = 1; offset <= WIN_SEQENCE - 1; offset++) {
                    Ball diagonalBall = columns[i - offset].getStack()[j + offset];
                    if (!ball.equals(diagonalBall))
                        break;
                    else {
                        winBalls[offset] = diagonalBall;
                        if (offset == WIN_SEQENCE - 1)
                            return winBalls;
                    }
                }
            }
        }

        return null;
    }

    // returns an array with winning Balls or empty array
    public Ball[] isWinPosition() {
        Ball[] balls;

        balls = isWinPositionVertical();
        if (Objects.nonNull(balls))
            return balls;

        balls = isWinPositionHorizontal();
        if (Objects.nonNull(balls))
            return balls;

        balls = isWinPositionDiagonal();
        if (Objects.nonNull(balls))
            return balls;

        return null;
    }

    public String toString() {
        StringBuilder rv = new StringBuilder();
        for (int i = lines - 1; i >= 0; i--) {
            for (int j = 0; j < columns.length; j++) {
                Ball ball = columns[j].getStack()[i];
                if (Objects.isNull(ball))
                    rv.append("x");
                else
                    rv.append(ball.getColor());
            }
            rv.append("\n");
        }
        return rv.toString();
    }

}
