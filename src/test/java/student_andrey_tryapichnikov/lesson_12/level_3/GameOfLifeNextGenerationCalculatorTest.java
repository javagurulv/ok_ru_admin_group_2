package student_andrey_tryapichnikov.lesson_12.level_3;

import org.junit.Test;
import org.junit.Assert;

public class GameOfLifeNextGenerationCalculatorTest {
    GameOfLifeNextGenerationCalculator theGame = new GameOfLifeNextGenerationCalculator();
    // rule 3 seems to be covered by all of them

    @Test
    public void testRule1() {
        boolean[][] testArray = {
                {false, true, false},
                {false, true, false},
                {false, false, false}
        };
        boolean[][] resultingArray = {
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };
        Assert.assertArrayEquals(resultingArray, theGame.calculate(testArray));
    }

    @Test
    public void testRule2() {
        boolean[][] testArray = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        boolean[][] resultingArray = {
                {true, false, true},
                {false, false, false},
                {true, false, true}
        };
        Assert.assertArrayEquals(resultingArray, theGame.calculate(testArray));
    }

    @Test
    public void testRule4() {
        boolean[][] testArray = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        boolean[][] resultingArray = {
                {true, false, true},
                {false, false, false},
                {true, false, true}
        };
        Assert.assertArrayEquals(resultingArray, theGame.calculate(testArray));
    }
}