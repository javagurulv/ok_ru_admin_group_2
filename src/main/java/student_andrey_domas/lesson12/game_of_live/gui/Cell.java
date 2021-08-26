package student_andrey_domas.lesson12.game_of_live.gui;

import java.awt.*;

public class Cell extends Component {

    private static final int WIDTH = 30;
    private static final int HEIGHT = WIDTH;
    private Color color;

    public Cell(Color color) {
        this.color = color;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(0, 0, WIDTH, HEIGHT);
    }
}
