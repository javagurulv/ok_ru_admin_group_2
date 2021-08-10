package student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.ui;

import student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game.Ball;
import student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game.Column;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

class ColumnUI extends JLabel implements MouseListener {
    private Column gameColumn;
    private Dimension minSize;
    final static int PADDING = 5;
    private int heigth;

    private CurrentColorKeeper cck;

    public ColumnUI(Column column, int width, int height, CurrentColorKeeper currentColorKeeper) {
        super();
        this.cck = currentColorKeeper;
        this.heigth = height;
        this.gameColumn = column;
        minSize = new Dimension(width, height);
        setBorder(BorderFactory.createLineBorder(Color.black, 1));
        setBackground(Color.RED);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (cck.gameOver)
            return;
        gameColumn.putBall(new BallUI(cck.currentColor));
        if (cck.currentColor == Ball.RED)
            cck.currentColor = Ball.GREEN;
        else
            cck.currentColor = Ball.RED;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Ball[] stack = gameColumn.getStack();
        for (int i = 0; i < stack.length; i++) {
            Ball ball = stack[i];
            if (Objects.nonNull(ball)) {
                BallUI ballUI = (BallUI) ball;
                ballUI.draw(g, PADDING / 2, heigth - (i + 1) * BallUI.DIAMETER - PADDING / 2);
            }
        }
    }

    public Dimension getMinimumSize() {
        return minSize;
    }

    public Dimension getPreferredSize() {
        return minSize;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}