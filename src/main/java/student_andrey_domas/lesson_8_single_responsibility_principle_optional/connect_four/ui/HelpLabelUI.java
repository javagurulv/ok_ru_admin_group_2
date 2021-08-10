package student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.ui;

import student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game.Ball;

import javax.swing.*;
import java.awt.*;

public class HelpLabelUI extends JLabel {
    private CurrentColorKeeper currentColorKeeper;

    public HelpLabelUI(String text, CurrentColorKeeper currentColorKeeper) {
        super(text);
        this.currentColorKeeper = currentColorKeeper;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (currentColorKeeper.gameOver)
            return;
        if (currentColorKeeper.currentColor == Ball.RED)
            setForeground(Color.RED);
        else
            setForeground(Color.GREEN);
    }

    public void win(int color) {
        if (color == Ball.RED) {
            setForeground(Color.RED);
            setText("RED win! Game over.");
        }
        else if (color == Ball.GREEN) {
            setForeground(Color.GREEN);
            setText("GREEN win! Game over.");
        }
    }
}
