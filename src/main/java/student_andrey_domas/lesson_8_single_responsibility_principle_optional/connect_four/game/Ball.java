package student_andrey_domas.lesson_8_single_responsibility_principle_optional.connect_four.game;

import java.util.Objects;

public class Ball {
    // true == green
    // false == red

    public static final int GREEN = 0;
    public static final int RED = 1;

    private int color;

    public Ball(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return color == ball.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
