package student_andrey_domas.lesson7.level7.task_32;

import org.junit.Before;
import org.junit.Test;

public class MathOperationTest {

    private Argument arg1;
    private Argument arg2;

    private static final double VAL1 = Math.PI;
    private static final double VAL2 = Math.PI + Math.PI;

    @Before
    public void setup() {
        arg1 = new Argument(VAL1);
        arg2 = new Argument(VAL2);
    }

    @Test
    public void testAddition() {
        MathOperation addition  = new Addition(arg1, arg1);
        assert addition.calculate() == VAL2;
    }

    @Test
    public void testSubtraction() {
        MathOperation subtraction = new Subtraction(arg2, arg1);
        assert subtraction.calculate() == VAL1;
    }

    @Test
    public void testDivision() {
        MathOperation division = new Division(arg2, arg1);
        assert division.calculate() == 2;
    }

    @Test
    public void testMultiplication() {
        MathOperation multiplication = new Multiplication(arg1, arg2);
        assert multiplication.calculate() == VAL1 * VAL2;
    }
}
