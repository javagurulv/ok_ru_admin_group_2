package student_andrey_domas.lesson4.level6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StockTests {

    Stock stock;

    @Before
    public void init() {
        stock = new Stock("GOOG", 10);
    }

    @Test
    public void testStock() {
        stock.updatePrice(12);
        assertEquals("Company = GOOG, Current Price = 12, Min Price = 10, Max Price = 12", stock.getPriceInformation());

        stock.updatePrice(5);
        assertEquals("Company = GOOG, Current Price = 5, Min Price = 5, Max Price = 12", stock.getPriceInformation());

        stock.updatePrice(7);
        assertEquals("Company = GOOG, Current Price = 7, Min Price = 5, Max Price = 12", stock.getPriceInformation());

        stock.updatePrice(99);
        assertEquals("Company = GOOG, Current Price = 99, Min Price = 5, Max Price = 99", stock.getPriceInformation());

        stock.updatePrice(77);
        assertEquals("Company = GOOG, Current Price = 77, Min Price = 5, Max Price = 99", stock.getPriceInformation());
    }

}
