package student_andrey_domas.lesson4.level4;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CalculatorTests {

    Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        assertEquals(12, calculator.sum(5, 7));
    }

    @Test
    public void testMult() {
        assertEquals(35, calculator.mult(5, 7));
    }

    @Test
    public void testSub() {
        assertEquals(-2, calculator.sub(5, 7));
    }

    @Test
    public void testDiv() {
        assertEquals(2, calculator.div(13, 6));
    }

    @Test
    public void testEven() {
        assertTrue(calculator.isEven(8));
    }

    @Test
    public void testNotEven() {
        assertFalse(calculator.isEven(7));
    }

    @Test
    public void testMaxOfTwoNumbersSecond() {
        assertEquals(5, calculator.maxOfTwoNumbers(4, 5));
    }

    @Test
    public void testMaxOfTwoNumbersFirst() {
        assertEquals(5, calculator.maxOfTwoNumbers(5, 4));
    }

    @Test
    public void testMaxOfTwoNumbersEquals() {
        assertEquals(4, calculator.maxOfTwoNumbers(4, 4));
    }

    @Test
    public void testMax() {
        int[] numbers = {0, 1, -2, 3, 5, 4};
        assertEquals(5, calculator.getMaxOfArray(numbers));
    }

    @Test
    public void testMax1() {
        int[] numbers = {4, 1, 3};
        assertEquals(4, calculator.getMaxOfArray(numbers));
    }

    @Test
    public void testMax2() {
        int[] numbers = {1, 4, 3};
        assertEquals(4, calculator.getMaxOfArray(numbers));
    }

    @Test
    public void testMax3() {
        int[] numbers = {1, 2, 3};
        assertEquals(3, calculator.getMaxOfArray(numbers));
    }

    @Test
    public void testMax4() {
        int[] numbers = {5, 5, 5};
        assertEquals(5, calculator.getMaxOfArray(numbers));
    }
}
