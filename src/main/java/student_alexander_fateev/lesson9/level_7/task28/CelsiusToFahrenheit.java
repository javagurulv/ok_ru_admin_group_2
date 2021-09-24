package student_alexander_fateev.lesson9.level_7.task28;

class CelsiusToFahrenheit implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return (celsiusTemperature * 1.8) + 32;
    }
}
