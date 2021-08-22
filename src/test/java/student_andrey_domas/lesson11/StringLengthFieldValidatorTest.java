package student_andrey_domas.lesson11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleStringEnglish;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleStringLength;

import java.util.List;

public class StringLengthFieldValidatorTest {

    class C {
        @ValidatorRuleStringLength(min = 3, max = 11)
        private String s = "1234567890x";

        public void setS(String s) {
            this.s = s;
        }
    }

    private Validator<StringLengthFieldValidatorTest.C> v;
    private StringLengthFieldValidatorTest.C c;

    @Before
    public void setup() {
        v = new ValidatorImpl<>();
        c = new StringLengthFieldValidatorTest.C();
    }

    @Test
    public void valid() {
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(0, exceptions.size());
    }

    @Test
    public void validNull() {
        c.setS(null);
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(0, exceptions.size());
    }

    @Test
    public void invalidMin() {
        c.setS("xx");
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("s", e.getFieldName());
        Assert.assertEquals("length 2 < 3", e.getMessage());
    }

    @Test
    public void invalidMax() {
        c.setS("xxxxxxxxxxxxxxxx");
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("s", e.getFieldName());
        Assert.assertEquals("length 16 > 11", e.getMessage());
    }

    @Test
    public void integerTest() {
        class C {
            @ValidatorRuleStringLength(min = 3, max = 11)
            private Integer i = 123;
        }
        Validator<C> v = new ValidatorImpl<>();
        C c = new C();
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("i", e.getFieldName());
        Assert.assertEquals("Can't validate field", e.getMessage());
    }
}
