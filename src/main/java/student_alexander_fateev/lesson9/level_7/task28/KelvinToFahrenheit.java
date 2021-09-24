package student_alexander_fateev.lesson9.level_7.task28;

class KelvinToFahrenheit implements TemperatureConverter {
    @Override
    public double convert(double kelvinTemperature) {
        return ((kelvinTemperature - 273.15) * 1.8) + 32;
    }
}
