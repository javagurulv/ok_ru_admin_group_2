package student_andrey_domas.lesson4.level3;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TheeNumbersTests {

    @Test
    public void testNotEqual() {
        int[] numbers = {5, 4, 5, 4, 5};
        assertFalse(ThreeNumbers.isEqual(numbers));
    }

    @Test
    public void testEqual() {
        int[] numbers = {5, 5, 5};
        assertTrue(ThreeNumbers.isEqual(numbers));
    }

    @Test
    public void testDifferent() {
        int[] numbers = {1, 2, 3};
        assertTrue(ThreeNumbers.isDifferent(numbers));
    }

    @Test
    public void testNotDifferent() {
        int[] numbers = {1, 1, 3, 4, 5};
        assertFalse(ThreeNumbers.isDifferent(numbers));
    }

    @Test
    public void testDecreasing() {
        int[] numbers = {3, 2, 0, 0, -1};
        assertTrue(ThreeNumbers.isDecreasing(numbers));
    }

    @Test
    public void testDecreasingEquals() {
        int[] numbers = {3, 3, 0, 0, 0};
        assertTrue(ThreeNumbers.isDecreasing(numbers));
    }

    @Test
    public void testDecreasingAllEquals() {
        int[] numbers = {0, 0, 0};
        assertFalse(ThreeNumbers.isDecreasing(numbers));
    }

    @Test
    public void testNotDecreasing() {
        int[] numbers = {3, 2, 3, 2};
        assertFalse(ThreeNumbers.isDecreasing(numbers));
    }

    @Test
    public void testIncreasing() {
        int[] numbers = {1, 2, 3};
        assertTrue(ThreeNumbers.isIncreasing(numbers));
    }

    @Test
    public void testIncreasingEquals() {
        int[] numbers = {1, 2, 2, 3, 3};
        assertTrue(ThreeNumbers.isIncreasing(numbers));
    }

    @Test
    public void testIncreasingAllEquals() {
        int[] numbers = {2, 2, 2};
        assertFalse(ThreeNumbers.isIncreasing(numbers));
    }

    @Test
    public void testNotIncreasing() {
        int[] numbers = {1, 2, 0, 0};
        assertFalse(ThreeNumbers.isIncreasing(numbers));
    }

    @Test
    public void testMax() {
        int[] numbers = {0, 1, -2, 3, 5, 4};
        assertEquals(5, ThreeNumbers.getMax(numbers));
    }
}
