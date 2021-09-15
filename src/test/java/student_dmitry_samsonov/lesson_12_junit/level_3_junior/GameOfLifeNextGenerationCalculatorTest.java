package student_dmitry_samsonov.lesson_12_junit.level_3_junior;

import org.junit.Assert;
import org.junit.Test;

public class GameOfLifeNextGenerationCalculatorTest {
    private GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator =
            new GameOfLifeNextGenerationCalculator();

    @Test
    public void calculate1() {
        //Правило 1:
        //Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
        boolean[][] initial = {{true, false, false}, {false, true, false}, {false, false, false}};
        boolean[][] expected = {{false, false, false}, {false, false, false}, {false, false, false}};
        Assert.assertEquals(expected, gameOfLifeNextGenerationCalculator.calculate(initial));
    }
    @Test
    public void calculate2() {
        //Правило 2:
        //Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.
        boolean[][] initial = {{true, true, true},
                               {true, true, true},
                               {true, true, true}};
        boolean[][] expected = {{true, false, true},
                                {false, false, false},
                                {true, false, true}};
        Assert.assertEquals(expected, gameOfLifeNextGenerationCalculator.calculate(initial));
    }
    @Test
    public void calculate4() {
        //Правило 4:
        //Любая мёртвая клетка с тремя живыми соседями становится живой в следующем поколении.
        boolean[][] initial = {{false, true, true},
                               {true, true, true},
                               {true, true, true}};
        boolean[][] expected = {{true, false, true},
                                {false, false, false},
                                {true, false, true}};
        Assert.assertEquals(expected, gameOfLifeNextGenerationCalculator.calculate(initial));
    }

}