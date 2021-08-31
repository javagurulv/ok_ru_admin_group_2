package student_andrey_domas.lesson12.string_calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator sc;

    @Before
    public void setup() {
        sc = new StringCalculator();
    }

    @Test
    public void emptyString() throws StringCalculatorException {
        Assert.assertEquals(0, sc.add(""));
    }

    @Test
    public void justANumber() throws StringCalculatorException {
        Assert.assertEquals(5, sc.add("5"));
    }

    @Test
    public void comma() throws StringCalculatorException {
        Assert.assertEquals(6, sc.add("1,2,3"));
    }

    @Test
    public void newLine() throws StringCalculatorException {
        Assert.assertEquals(4, sc.add("1\n0\n3"));
    }

    @Test
    public void newLineAndComma() throws StringCalculatorException {
        Assert.assertEquals(8, sc.add("1\n0\n3,1\n2,1"));
    }

    @Test(expected = StringCalculatorException.class)
    public void unclosedDelimiterError() throws StringCalculatorException {
        sc.add("1\n");
    }

    @Test(expected = StringCalculatorException.class)
    public void twoNewLinesError() throws StringCalculatorException {
        sc.add("1\n\n1");
    }

    @Test(expected = StringCalculatorException.class)
    public void twoCommasError() throws StringCalculatorException {
        sc.add("1,,1");
    }

    @Test
    public void delimiterList() throws StringCalculatorException {
        Assert.assertEquals(3, sc.add("//[;]\n1;2"));
    }

    @Test
    public void delimiterListComplex() throws StringCalculatorException {
        Assert.assertEquals(8, sc.add("//[;][aaa]\n1;2aaa5"));
    }

    @Test(expected = StringCalculatorException.class)
    public void delimiterListComplexError() throws StringCalculatorException {
        Assert.assertEquals(8, sc.add("//[;][aaa]\n1;2aaa5aaa"));
    }

}