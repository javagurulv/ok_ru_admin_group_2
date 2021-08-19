package student_dmitry_samsonov.lesson_9_interfaces.level_7_senior;

class TemperatureConverterTest {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(123.0, TemperatureKind.CELSIUS);
        temperature.toFahrenheit();
        printTestResult("Celsius 123.0 == Fahrenheit 253.4",
                 temperature.getValue() == 253.4 && temperature.getUnit() == TemperatureKind.FAHRENHEIT);
        temperature.toKelvin();
        printTestResult("Fahrenheit 253.4 == Kelvin 396.15",
                temperature.getValue() == 396.15 && temperature.getUnit() == TemperatureKind.KELVIN);
        temperature.toCelsius();
        printTestResult("Kelvin 396.15 == Celsius 123.0",
                temperature.getValue() == 123.0 && temperature.getUnit() == TemperatureKind.CELSIUS);
    }
    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }
}
