package student_sergo_kurbanov.lesson_6.level_5_6;

public class Move {
    private int x;
    private int y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }
}
