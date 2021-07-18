package student_andrey_domas.lesson6.level5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
}
