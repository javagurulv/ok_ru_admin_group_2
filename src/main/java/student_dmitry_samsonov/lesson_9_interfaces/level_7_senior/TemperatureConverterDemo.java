package student_dmitry_samsonov.lesson_9_interfaces.level_7_senior;

public class TemperatureConverterDemo {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(123.0, TemperatureKind.CELSIUS);
        temperature.toFahrenheit();
        System.out.println("Celsius 123.0 == Fahrenheit " + temperature.getValue());
        temperature.toKelvin();
        System.out.println("Fahrenheit 253.4 == Kelvin " + temperature.getValue());
        temperature.toCelsius();
        System.out.println("Kelvin 396.15 == Celsius " + temperature.getValue());
    }
}