package student_artem_aleksandrov.lesson9.level4;

import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinConverterTest {

    @Test
    public void convert() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        assertEquals(kelvinConverter.convert(0), 273.15, 0);
        assertEquals(kelvinConverter.convert(1), 274.15, 0);
    }
}