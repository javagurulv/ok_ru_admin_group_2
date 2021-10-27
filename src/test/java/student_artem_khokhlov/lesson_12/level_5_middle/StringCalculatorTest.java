package student_artem_khokhlov.lesson_12.level_5_middle;

import junit.framework.TestCase;

public class StringCalculatorTest extends TestCase {
    StringCalculator calc = new StringCalculator();

    public void testAdd() {
        assertEquals(5, calc.add("3,2"));
    }
    public void testAddEmpty() {
        assertEquals(0, calc.add(""));
    }
    public void testAddSeveral() {
        assertEquals(10, calc.add("1,3,6"));
    }
    public void testNegative() {
        assertEquals(5, calc.add("-5,10"));
    }
    public void testAddOne() {
        assertEquals(3, calc.add("3"));
    }
}