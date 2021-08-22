package student_andrey_domas.lesson11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ProductValidationTest {

    Validator<Product> pv;

    @Before
    public void setup() {
        pv = new ValidatorImpl<>();
    }

    @Test
    public void valid() {
        Product p = new Product("test product", 253, "test description");
        List<ValidationException> exceptions = pv.validate(p);
        Assert.assertEquals(0, exceptions.size());
    }

    @Test
    public void invalidNonEnglishTitle() {
        Product p = new Product("xxx_yyy", 253, "test description");
        List<ValidationException> exceptions = pv.validate(p);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("title", e.getFieldName());
        Assert.assertEquals("not only English symbols and numbers", e.getMessage());
    }

    @Test
    public void invalidTitleNull() {
        Product p = new Product(null, 253, "test description");
        List<ValidationException> exceptions = pv.validate(p);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("title", e.getFieldName());
        Assert.assertEquals("is empty", e.getMessage());
    }

    @Test
    public void invalidTitleEmpty() {
        Product p = new Product("", 253, "test description");
        List<ValidationException> exceptions = pv.validate(p);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("title", e.getFieldName());
        Assert.assertEquals("length 0 < 3", e.getMessage());
    }

    @Test
    public void invalidLongTitle() {
        String longTitle = new String(new char[500]).replace('\0', 'x');
        Product p = new Product(longTitle, 253, "test description");
        List<ValidationException> exceptions = pv.validate(p);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("title", e.getFieldName());
        Assert.assertEquals("length 500 > 100", e.getMessage());
    }

    @Test
    public void invalidNonEnglishDescription() {
        Product p = new Product("test product", 253, "xxx_yy");
        List<ValidationException> exceptions = pv.validate(p);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("description", e.getFieldName());
        Assert.assertEquals("not only English symbols and numbers", e.getMessage());
    }

    @Test
    public void invalidPriceNull() {
        Product p = new Product("test product", null, "test description");
        List<ValidationException> exceptions = pv.validate(p);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("price", e.getFieldName());
        Assert.assertEquals("is empty", e.getMessage());
    }

    @Test
    public void invalidPriceZero() {
        Product p = new Product("test product", 0, "test description");
        List<ValidationException> exceptions = pv.validate(p);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("price", e.getFieldName());
        Assert.assertEquals("0 < 1", e.getMessage());
    }

    @Test
    public void invalidLongDescription() {
        String longDescription = new String(new char[5000]).replace('\0', 'x');
        Product p = new Product("test product", 253, longDescription);
        List<ValidationException> exceptions = pv.validate(p);
        Assert.assertEquals(1, exceptions.size());
        ValidationException e = exceptions.get(0);
        Assert.assertEquals("description", e.getFieldName());
        Assert.assertEquals("length 5000 > 2000", e.getMessage());
    }

}
