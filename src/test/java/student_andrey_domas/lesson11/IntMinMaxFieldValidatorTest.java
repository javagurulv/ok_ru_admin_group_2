package student_andrey_domas.lesson11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleIntMinMax;

import java.util.List;

public class IntMinMaxFieldValidatorTest {

    class C {
        @ValidatorRuleIntMinMax(min = 1)
        private Integer min1 = null;

        @ValidatorRuleIntMinMax(min = 1, max = 100)
        private Integer min1max100 = null;

        @ValidatorRuleIntMinMax(max = 20)
        private Integer max20 = null;

        public void setMin1(Integer min1) {
            this.min1 = min1;
        }

        public void setMin1max100(Integer min1max100) {
            this.min1max100 = min1max100;
        }

        public void setMax20(Integer max20) {
            this.max20 = max20;
        }
    }

    private Validator<C> v;
    private C c;

    @Before
    public void setup() {
        v = new ValidatorImpl<>();
        c = new C();
    }

    @Test
    public void validTestNull() {
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(0, exceptions.size());
    }

    @Test
    public void validTest() {
        c.setMin1(10);
        c.setMax20(10);
        c.setMin1max100(50);
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(0, exceptions.size());
    }

    @Test
    public void invalidMin1Test() {
        c.setMin1(-10);
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("min1", e.getFieldName());
        Assert.assertEquals("-10 < 1", e.getMessage());
    }

    @Test
    public void invalidMin1Max100_500Test() {
        c.setMin1max100(500);
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("min1max100", e.getFieldName());
        Assert.assertEquals("500 > 100", e.getMessage());
    }

    @Test
    public void invalidMin1Max100_0Test() {
        c.setMin1max100(0);
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("min1max100", e.getFieldName());
        Assert.assertEquals("0 < 1", e.getMessage());
    }

    @Test
    public void invalidMax20_50Test() {
        c.setMax20(50);
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("max20", e.getFieldName());
        Assert.assertEquals("50 > 20", e.getMessage());
    }

    @Test
    public void invalidALLTest() {
        c.setMin1max100(0);
        c.setMin1(-10);
        c.setMax20(50);
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(3, exceptions.size());
    }

    @Test
    public void stringTest() {
        class C {
            @ValidatorRuleIntMinMax(min = 1)
            private String s = "xxx";
        }
        Validator<C> v = new ValidatorImpl<>();
        C c = new C();
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("s", e.getFieldName());
        Assert.assertEquals("Can't validate field", e.getMessage());
    }

}
