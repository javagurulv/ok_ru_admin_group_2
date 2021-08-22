package student_dmitry_samsonov.lesson_9_interfaces.level_4_junior;

class TemperatureConverterTest {
    public static void main(String[] args) {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

        printTestResult("Celsius 1", celsiusConverter.convert(1.0) == 1.0);
        printTestResult("Kelvin 1", kelvinConverter.convert(1.0) == 274.15);
        printTestResult("Farenheit 1", fahrenheitConverter.convert(1.0) == 33.8);

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
