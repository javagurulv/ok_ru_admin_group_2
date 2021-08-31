package student_andrey_domas.lesson12.game_of_live.gui;

import student_andrey_domas.lesson12.game_of_live.GameOfLifeUI;

import javax.swing.*;
import java.awt.*;

public class GameOfLifeGUI extends JFrame implements GameOfLifeUI {

    private GridLayout fieldLayout;

    public GameOfLifeGUI(int width, int height) {
        super("Game Of Life");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width,height);
        fieldLayout = new GridLayout();
        setLayout(fieldLayout);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void show(boolean[][] field) {
        fieldLayout.setRows(field.length);
        fieldLayout.setColumns(field[0].length);
        Container container = getContentPane();
        container.removeAll();  // remove all cells
        for (int row = 0; row < field.length; row++)
            for (int column = 0; column < field[row].length; column++) {
                Color color =  field[row][column] ? Color.BLACK : Color.WHITE;
                container.add(new Cell(color));  // add new cell
            }
        container.doLayout();  // refresh window content
    }
}
