package student_andrey_domas.lesson12.game_of_live;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameOfLifeNextGenerationCalculatorTest {

    private GameOfLifeNextGenerationCalculator c;

    @Before
    public void setup() {
        c = new GameOfLifeNextGenerationCalculator();
    }

    @Test
    public void lessThanTwoNeighbours1() {
        boolean current[][] = {
                {true, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean expected[][] = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

    @Test
    public void lessThanTwoNeighbours2() {
        boolean current[][] = {
                {true, false, false, false, false},
                {false, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean expected[][] = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

    @Test
    public void lessThanTwoNeighbours3() {
        boolean current[][] = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, true},
        };
        boolean expected[][] = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

    @Test
    public void lessThanTwoNeighbours4() {
        boolean current[][] = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, false, true, false, false},
                {false, false, false, false, true},
        };
        boolean expected[][] = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, true, false},
                {false, false, false, false, false},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

    @Test
    public void greaterThanThreeNeighbours1() {
        boolean current[][] = {
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, true, true, true, false},
                {false, false, true, false, false},
                {false, false, false, false, false},
        };
        boolean expected[][] = {
                {false, false, false, false, false},
                {false, true, true, true, false},
                {false, true, false, true, false},
                {false, true, true, true, false},
                {false, false, false, false, false},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

    @Test
    public void greaterThanThreeNeighbours2() {
        boolean current[][] = {
                {true, true, true, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true},
        };
        boolean expected[][] = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

    @Test
    public void greaterThanThreeNeighbours3() {
        boolean current[][] = {
                {false, false, false, false, true},
                {false, false, false, false, true},
                {false, false, false, true, true},
                {false, false, false, false, true},
                {false, false, false, false, true},
        };
        boolean expected[][] = {
                {true, false, false, true, true},
                {true, false, false, false, true},
                {true, false, false, true, true},
                {true, false, false, false, true},
                {true, false, false, true, true},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

    @Test
    public void noOneDie1() {
        boolean current[][] = {
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, true, false, true, false},
                {false, false, true, false, false},
                {false, false, false, false, false},
        };
        boolean expected[][] = {
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, true, false, true, false},
                {false, false, true, false, false},
                {false, false, false, false, false},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

    @Test
    public void noOneDie2() {
        boolean current[][] = {
                {true, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {true, false, false, false, false},
                {false, true, false, false, true},
        };
        boolean expected[][] = {
                {true, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {true, false, false, false, false},
                {false, true, false, false, true},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

    @Test
    public void periodic1() {
        boolean current[][] = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, true, true, false, false},
                {false, true, true, false, false},
                {false, false, false, false, false},
        };
        boolean expected[][] = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, true, true, false, false},
                {false, true, true, false, false},
                {false, false, false, false, false},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

    @Test
    public void periodic2() {
        boolean current[][] = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean expected[][] = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

    @Test
    public void periodic3() {
        boolean current[][] = {
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, true, false, true, false},
                {false, false, true, false, false},
                {false, false, false, false, false},
        };
        boolean expected[][] = {
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, true, false, true, false},
                {false, false, true, false, false},
                {false, false, false, false, false},
        };
        Assert.assertArrayEquals(expected, c.calculate(current));
    }

}
