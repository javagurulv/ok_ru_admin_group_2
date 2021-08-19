package student_dmitry_samsonov.lesson_9_interfaces.level_7_senior;

public class Context {
    private TemperatureConverter strategy;

    public Context(TemperatureConverter strategy){
        this.strategy = strategy;
    }

    public double executeStrategy(double temperature){
        return strategy.convert(temperature);
    }
}