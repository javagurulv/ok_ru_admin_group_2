package student_alexander_fateev.lesson9.level_7.task28;

public class TemperatureConverterTest {
    private static TemperatureConverter strategy;

    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();

        test.testFahrenheitToCelsius();
        test.testFahrenheitToKelvin();
        test.testCelsiusToFahrenheit();
        test.testCelsiusToKelvin();
        test.testKelvinToCelsius();
        test.testKelvinToFahrenheit();
    }

    void testFahrenheitToCelsius() {
        double temperature = 113;
        double expectedResult = 45.0;
        String message = "Fahrenheit to celsius conversion";

        strategy = new FahrenheitToCelsius();
        double result = strategy.convert(temperature);
        printMessage(message, result, expectedResult);
    }

    void testFahrenheitToKelvin() {
        double temperature = 113;
        double expectedResult = 318.15;
        String message = "Fahrenheit to kelvin conversion";

        strategy = new FahrenheitToKelvin();
        double result = strategy.convert(temperature);
        printMessage(message, result, expectedResult);
    }

    void testCelsiusToFahrenheit() {
        double temperature = 45;
        double expectedResult = 113.0;
        String message = "Celsius to fahrenheit conversion";

        strategy = new CelsiusToFahrenheit();
        double result = strategy.convert(temperature);
        printMessage(message, result, expectedResult);
    }

    void testCelsiusToKelvin() {
        double temperature = 45;
        double expectedResult = 318.15;
        String message = "Celsius to kelvin conversion";

        strategy = new CelsiusToKelvin();
        double result = strategy.convert(temperature);
        printMessage(message, result, expectedResult);
    }

    void testKelvinToCelsius() {
        double temperature = 100;
        double expectedResult = -173.14999999999998;
        String message = "Kelvin to celsius conversion";

        strategy = new KelvinToCelsius();
        double result = strategy.convert(temperature);
        printMessage(message, result, expectedResult);
    }

    void testKelvinToFahrenheit() {
        double temperature = 100;
        double expectedResult = -279.66999999999996;
        String message = "Kelvin to fahrenheit conversion";

        strategy = new KelvinToFahrenheit();
        double result = strategy.convert(temperature);
        printMessage(message, result, expectedResult);
    }

    void printMessage(String message, double result, double expectedResult) {
        if (result == expectedResult) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }
}
