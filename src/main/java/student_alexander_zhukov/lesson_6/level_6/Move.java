package student_alexander_zhukov.lesson_6.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Move {

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
