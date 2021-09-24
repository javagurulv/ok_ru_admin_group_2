package student_artem_aleksandrov.lesson9.level4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitConverterTest {


    @Test
    public void convert() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        assertEquals(fahrenheitConverter.convert(0), 32, 0);
        assertEquals(fahrenheitConverter.convert(1), 33.8, 0);
    }
}