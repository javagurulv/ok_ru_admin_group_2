package student_andrey_domas.lesson9.level4;

import org.junit.Assert;
import org.junit.Test;
import student_andrey_domas.lesson9.level4.task12.FahrenheitConverter;
import student_andrey_domas.lesson9.level4.task12.KelvinConverter;
import student_andrey_domas.lesson9.level4.task12.TemperatureConverter;

public class TemperatureConverterTest {

    @Test
    public void testKelvin() {
        TemperatureConverter tc = new KelvinConverter();
        for (float i = 0; i <= 100; i += 0.5)
            Assert.assertEquals(i + 273.15, tc.convert(i), 0.001);
    }

    @Test
    public void testFahrenheit() {
        TemperatureConverter tc = new FahrenheitConverter();
        for (float i = 0; i <= 100; i += 0.5)
            Assert.assertEquals(i * 1.8 + 32, tc.convert(i), 0.001);
    }
}
