package student_andrey_domas.lesson9.level7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TemperatureTest {

    Temperature temperature100C;
    Temperature temperature100K;
    Temperature temperature100F;

    @Before
    public void setup() {
        temperature100C = new Temperature(100d);
        temperature100K = new Temperature(100d, TemperatureUnits.Kelvin);
        temperature100F = new Temperature(100d, TemperatureUnits.Fahrenheit);
    }

    @Test
    public void fahrenheitTest() {
        Assert.assertEquals(212, temperature100C.toFarenheit(), 0);
        Assert.assertEquals(-279.67, temperature100K.toFarenheit(), 0.01);
        Assert.assertEquals(100, temperature100F.toFarenheit(), 0);
    }

    @Test
    public void kelvinTest() {
        Assert.assertEquals(373.15, temperature100C.toKelvin(), 0);
        Assert.assertEquals(100, temperature100K.toKelvin(), 0);
        Assert.assertEquals(310.92, temperature100F.toKelvin(), 0.01);
    }

    @Test
    public void celsiusTest() {
        Assert.assertEquals(100, temperature100C.toCelsius(), 0);
        Assert.assertEquals(-173.15, temperature100K.toCelsius(), 0.01);
        Assert.assertEquals(37.77, temperature100F.toCelsius(), 0.01);
    }

}
