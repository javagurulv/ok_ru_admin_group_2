package student_andrey_domas.lesson9.level7;

public class Temperature {
    Double celsius;

    public Temperature(Double celsius) {
        this(celsius, TemperatureUnits.Celsius);
    }

    public Temperature(Double celsius, TemperatureUnits unit) {
        if (unit == TemperatureUnits.Celsius)
            this.celsius = celsius;
        else if (unit == TemperatureUnits.Kelvin)
            this.celsius = celsius - 273.15;
        else if (unit == TemperatureUnits.Fahrenheit)
            this.celsius = (celsius - 32) / 1.8;
    }

    public Double toFarenheit() {
        return new FahrenheitConverter().convert(celsius);
    }

    public Double toKelvin() {
        return new KelvinConverter().convert(celsius);
    }

    public Double toCelsius() {
        return celsius;
    }

}
