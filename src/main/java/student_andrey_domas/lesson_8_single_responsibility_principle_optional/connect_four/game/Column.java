package student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game;

public class Column {

    // 0 is bottom
    private Ball[] stack;
    private int lastIndex;

    public Column(int height) {
        this.stack = new Ball[height];
        this.lastIndex = 0;
    }

    public void putBall(Ball ball) {
        if (lastIndex < stack.length)
            stack[lastIndex++] = ball;
    }

    public Ball[] getStack() {
        return stack;
    }
}
