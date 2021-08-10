package student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.ui;

import student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game.Ball;

import java.awt.*;

public class BallUI extends Ball {
    static final int DIAMETER = 35;
    boolean winner = false;

    public BallUI(int color) {
        super(color);
    }

    public void draw(Graphics g, int x, int y) {
        if (getColor() == Ball.GREEN)
            g.setColor(Color.GREEN);
        else
            g.setColor(Color.RED);
        g.fillOval(x, y, DIAMETER, DIAMETER);

        if (winner) {
            g.setColor(Color.YELLOW);
            g.fillRect(x + 10, y + 10, DIAMETER - 10 * 2, DIAMETER - 10 * 2);
        }
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
}
