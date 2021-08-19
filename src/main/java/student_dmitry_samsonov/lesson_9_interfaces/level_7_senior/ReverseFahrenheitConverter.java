package student_dmitry_samsonov.lesson_9_interfaces.level_7_senior;

class ReverseFahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) / 1.8;
    }
}