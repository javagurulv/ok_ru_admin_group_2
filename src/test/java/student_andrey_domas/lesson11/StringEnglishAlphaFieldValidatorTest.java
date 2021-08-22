package student_andrey_domas.lesson11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleIntMinMax;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleStringEnglish;

import java.util.List;

public class StringEnglishAlphaFieldValidatorTest {
    class C {
        @ValidatorRuleStringEnglish
        private String s = "abcdef123";

        public void setS(String s) {
            this.s = s;
        }
    }

    private Validator<StringEnglishAlphaFieldValidatorTest.C> v;
    private StringEnglishAlphaFieldValidatorTest.C c;

    @Before
    public void setup() {
        v = new ValidatorImpl<>();
        c = new StringEnglishAlphaFieldValidatorTest.C();
    }

    @Test
    public void valid() {
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(0, exceptions.size());
    }

    @Test
    public void validEmpty() {
        c.setS("");
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(0, exceptions.size());
    }

    @Test
    public void invalidSymbol() {
        c.setS("abcdef123_");
        List<ValidationException> exceptions = v.validate(c);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("s", e.getFieldName());
        Assert.assertEquals("not only English symbols and numbers", e.getMessage());
    }

    @Test
    public void integerTest() {
        class C {
            @ValidatorRuleStringEnglish
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
