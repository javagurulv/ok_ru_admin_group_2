package student_andrey_domas.lesson12.game_of_live;

public class GameOfLifeGliderFieldGenerator implements GameOfLifeFieldGenerator {
    public boolean[][] generate() {
        boolean[][] f = {
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, true, false, false, false, false, false},
                {false, false, false, false, false, true, false, false, false, false},
                {false, false, false, true, true, true, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
        };
        return f;
    }
}
