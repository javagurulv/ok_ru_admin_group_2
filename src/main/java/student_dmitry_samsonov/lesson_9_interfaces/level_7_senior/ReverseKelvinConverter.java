package student_dmitry_samsonov.lesson_9_interfaces.level_7_senior;

class ReverseKelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double kelvinTemperature) {
        return kelvinTemperature - 273.15;
    }
}