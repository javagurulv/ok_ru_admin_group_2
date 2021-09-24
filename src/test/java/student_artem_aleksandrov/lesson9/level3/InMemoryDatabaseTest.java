package student_artem_aleksandrov.lesson9.level3;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class InMemoryDatabaseTest {

    InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
    Product product1 = new Product("product1");
    Product product2 = new Product("product2");

    @Test
    public void save() {
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
    }

    @Test
    public void findByTitle() {
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        assertEquals(inMemoryDatabase.findByTitle("product1"), Optional.of(product1));
        assertEquals(inMemoryDatabase.findByTitle("product2"), Optional.of(product2));
        assertEquals(inMemoryDatabase.findByTitle("product3"), Optional.empty());
    }

}