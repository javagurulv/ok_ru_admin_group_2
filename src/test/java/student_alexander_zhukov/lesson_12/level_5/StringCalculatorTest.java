package student_alexander_zhukov.lesson_12.level_5;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void dataInOneNumber() {
        var numbers = "1";
        var sum = stringCalculator.add(numbers);
        assertEquals(sum, 1);
    }

    @Test
    public void dataInOneIsBlank() {
        var numbers = "";
        var sum = stringCalculator.add(numbers);
        assertEquals(sum, 0);
    }

    @Test
    public void dataInTwoNumbers() {
        var numbers = "6,25";
        var sum = stringCalculator.add(numbers);
        assertEquals(sum, 31);
    }

    @Test
    public void dataInSeveralNumbers() {
        var numbers = "10,55,99";
        var sum = stringCalculator.add(numbers);
        assertEquals(sum, 164);
    }

    @Test
    public void dataInWithNewLineNumbers() {
        var numbers = "1\n2,3,4";
        var sum = stringCalculator.add(numbers);
        assertEquals(sum, 10);
    }

    @Test
    public void dataInWithCustomDelimiterNumbers() {
        var numbers = "//[;]\n1;2";
        var sum = stringCalculator.add(numbers);
        assertEquals(sum, 3);
    }

    @Test
    public void dataInWithCustomDelimitersNumbers() {
        var numbers = "//[;][&]\n1;2&3";
        var sum = stringCalculator.add(numbers);
        assertEquals(sum, 6);
    }

}