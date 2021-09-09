package student_alexander_zhukov.lesson_9.level_4;

class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();


        test.convertKelvinTest(10,283.15);
        test.convertFahrenheitTest(50,122.0);
    }

    public void convertKelvinTest(double celsiusTemperature, double answer) {
        KelvinConverter kelvin = new KelvinConverter();
        checkResults(kelvin.convert(celsiusTemperature) == answer, "KelvinConvertTest");
    }

    public void convertFahrenheitTest(double celsiusTemperature, double answer) {
        FahrenheitConverter fahrenheit = new FahrenheitConverter();
        checkResults(fahrenheit.convert(celsiusTemperature) == answer, "FahrenheitConvertTest");
    }

    public void checkResults(boolean result, String name) {
        if (result) {
            System.out.println("Test " + name + " - OK");
        } else {
            System.out.println("Test " + name + " - FAIL");
        }
    }
}
