package student_dmitry_samsonov.lesson_12_junit.level_5_middle;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void add1() {
        Assert.assertEquals(0, this.stringCalculator.add(""));
    }

    @Test
    public void add2() {
        Assert.assertEquals(1, this.stringCalculator.add("1"));
    }

    @Test
    public void add3() {
        Assert.assertEquals(3, this.stringCalculator.add("1,2"));
    }

    @Test
    public void add4() {
        Assert.assertEquals(10, this.stringCalculator.add("1\n2,3,4"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void add5() {
        this.stringCalculator.add("1\\n");
    }

    @Test
    public void add6() {
        Assert.assertEquals(3, this.stringCalculator.add("//[;]\n[1;2]"));
    }

    @Test
    public void add7() {
        Assert.assertEquals(6, this.stringCalculator.add("//[;][&]\n[1;2&3]"));
    }

}