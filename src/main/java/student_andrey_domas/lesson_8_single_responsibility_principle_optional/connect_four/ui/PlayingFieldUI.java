package student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.ui;

import student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game.Ball;
import student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game.Column;
import student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game.PlayingField;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

public class PlayingFieldUI extends PlayingField implements MouseListener {

    private HelpLabelUI helpLabel;
    private CurrentColorKeeper cck;
    private JFrame fieldFrame;

    public PlayingFieldUI(int columns, int lines) {
        super(columns, lines);

        cck = new CurrentColorKeeper();

        fieldFrame = new JFrame("Connect Four Game");
        fieldFrame.setVisible(false);
        fieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fieldFrame.setLocationRelativeTo(null);

        Border paddingBorders = BorderFactory.createEmptyBorder(ColumnUI.PADDING,
                ColumnUI.PADDING, ColumnUI.PADDING, ColumnUI.PADDING);
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(paddingBorders);

        helpLabel = new HelpLabelUI("Click on column", cck);
        JPanel helpPanel = new JPanel();
        helpPanel.add(helpLabel);
        helpPanel.setBorder(paddingBorders);

        final int columnHeight = (BallUI.DIAMETER + 5) * lines;
        final int columnWidth = (BallUI.DIAMETER + 5);
        final int uiHeight = columnHeight + ColumnUI.PADDING * 10 + BallUI.DIAMETER;
        final int uiWidth = columns * columnWidth + columns * ColumnUI.PADDING * 2;
        fieldFrame.setSize(uiWidth, uiHeight);

        JPanel columnPanel = new JPanel();

        Column[] gameColumns = getColumns();
        for (int i = 0; i < gameColumns.length; i++) {
            ColumnUI columnUI = new ColumnUI(gameColumns[i], columnWidth, columnHeight, cck);
            columnUI.addMouseListener(this);
            columnPanel.add(columnUI);
        }

        mainPanel.add(helpPanel);
        mainPanel.add(columnPanel);
        fieldFrame.getContentPane().add(mainPanel);

        fieldFrame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (cck.gameOver)
            return;
        Ball[] winners = isWinPosition();
        if (Objects.nonNull(winners)) {
            helpLabel.win(winners[0].getColor());
            for (Ball ball: winners)
                ((BallUI) ball).setWinner(true);
            fieldFrame.repaint();
            cck.gameOver = true;
        }
        helpLabel.repaint();
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
