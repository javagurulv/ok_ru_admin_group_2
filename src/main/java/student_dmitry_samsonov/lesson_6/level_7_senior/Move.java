package student_dmitry_samsonov.lesson_6.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Move {
    private int x;
    private int y;
    Move (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
