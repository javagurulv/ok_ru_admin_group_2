package student_andrey_domas.lesson11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleNotEmpty;

import java.util.List;

public class NotEmptyFieldValidatorTest {

    class C {
        @ValidatorRuleNotEmpty
        private Integer i = 123;

        @ValidatorRuleNotEmpty
        private String s = "xxx";

        public void setI(Integer i) {
            this.i = i;
        }

        public void setS(String s) {
            this.s = s;
        }
    }

    private Validator<NotEmptyFieldValidatorTest.C> v;
    private NotEmptyFieldValidatorTest.C c;

    @Before
    public void setup() {
        v = new ValidatorImpl<>();
        c = new NotEmptyFieldValidatorTest.C();
    }

    @Test
    public void allValid() {
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(0, exceptions.size());
    }

    @Test
    public void allInvalid() {
        c.setS(null);
        c.setI(null);
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(2, exceptions.size());
    }

    @Test
    public void integrerNull() {
        c.setI(null);
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("i", e.getFieldName());
        Assert.assertEquals("is empty", e.getMessage());
    }

    @Test
    public void stringNull() {
        c.setS(null);
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("s", e.getFieldName());
        Assert.assertEquals("is empty", e.getMessage());
    }

    @Test
    public void stringEmpty() {
        c.setS("");
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(0, exceptions.size());
    }
}
