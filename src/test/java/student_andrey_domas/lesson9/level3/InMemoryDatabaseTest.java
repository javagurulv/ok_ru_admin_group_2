package student_andrey_domas.lesson9.level3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import student_andrey_domas.lesson9.level3.Product;
import student_andrey_domas.lesson9.level3.InMemoryDatabase;
import student_andrey_domas.lesson9.level3.ProductDatabase;

import java.util.Optional;

public class InMemoryDatabaseTest {

    ProductDatabase db;

    @Before
    public void setup() {
        db = new InMemoryDatabase();
    }

    @Test
    public void saveFindTest() {
        final String title1 = "XYZ1";
        final String title2 = "XYZ2";
        final String title3 = "XYZ3";

        Product product1 = new Product(title1);
        Product product2 = new Product(title2);
        Product product3 = new Product(title3);

        db.save(product1);
        db.save(product2);
        db.save(product3);

        Optional<Product> found1 = db.findByTitle(title1);
        Assert.assertEquals(title1, found1.get().getTitle());

        Optional<Product> found2 = db.findByTitle(title2);
        Assert.assertEquals(title2, found2.get().getTitle());

        Optional<Product> found3 = db.findByTitle(title3);
        Assert.assertEquals(title3, found3.get().getTitle());
    }

    @Test
    public void notFoundTest() {
        Product product = new Product("test");
        db.save(product);

        Optional<Product> found = db.findByTitle("XXX");
        Assert.assertTrue(found.isEmpty());
    }

}
