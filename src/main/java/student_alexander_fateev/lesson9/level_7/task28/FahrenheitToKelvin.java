package student_alexander_fateev.lesson9.level_7.task28;

class FahrenheitToKelvin implements TemperatureConverter {
    @Override
    public double convert(double fahrenheitTemperature) {
        return ((fahrenheitTemperature - 32)*5)/9 + 273.15;
    }
}
