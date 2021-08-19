package student_dmitry_samsonov.lesson_9_interfaces.level_7_senior;

import static student_dmitry_samsonov.lesson_9_interfaces.level_7_senior.TemperatureKind.*;

public class Temperature {
    private double value;
    private TemperatureKind unit;

    public double getValue() {
        return value;
    }

    public TemperatureKind getUnit() {
        return unit;
    }

    public Temperature(double value, TemperatureKind unit) {
        this.value = value;
        this.unit = unit;
    }
    public void setTemperature(double value, TemperatureKind unit){
        this.value = value;
        this.unit = unit;
    }
    public void toCelsius() {
        Context fahrenheitToCelsius = new Context(new ReverseFahrenheitConverter());
        Context kelvinToCelsius = new Context(new ReverseKelvinConverter());
        switch (this.unit) {
            case FAHRENHEIT -> {
                this.value = fahrenheitToCelsius.executeStrategy(this.value);
                this.unit = CELSIUS;
            }
            case KELVIN -> {
                this.value = kelvinToCelsius.executeStrategy(this.value);
                this.unit = CELSIUS;
            }
            default -> System.out.println("Unknown unit type: " + this.unit);
        }
    }
    public void toFahrenheit() {
        Context celsiusToFahrenheit = new Context(new FahrenheitConverter());
        Context kelvinToCelsius = new Context(new ReverseKelvinConverter());
        switch (this.unit) {
            case CELSIUS -> {
                this.value = celsiusToFahrenheit.executeStrategy(this.value);
                this.unit = FAHRENHEIT;
            }
            case KELVIN -> {
                this.value = kelvinToCelsius.executeStrategy(this.value);
                this.value = celsiusToFahrenheit.executeStrategy(this.value);
                this.unit = FAHRENHEIT;
            }
            default -> System.out.println("Unknown unit type: " + this.unit);
        }
    }
    public void toKelvin() {
        Context celsiusToKelvin = new Context(new KelvinConverter());
        Context fahrenheitToCelsius = new Context(new ReverseFahrenheitConverter());
        switch (this.unit) {
            case CELSIUS -> {
                this.value = celsiusToKelvin.executeStrategy(this.value);
                this.unit = KELVIN;
            }
            case FAHRENHEIT -> {
                this.value = fahrenheitToCelsius.executeStrategy(this.value);
                this.value = celsiusToKelvin.executeStrategy(this.value);
                this.unit = KELVIN;
            }
            default -> System.out.println("Unknown unit type: " + this.unit);
        }
    }
}
