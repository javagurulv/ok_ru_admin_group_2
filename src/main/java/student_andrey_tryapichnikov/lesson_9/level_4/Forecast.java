package student_andrey_tryapichnikov.lesson_9.level_4;

public class Forecast {
    Region region;
    Double temp;
    Double tempK;
    Double tempF;

    public Forecast (Region region, int range) {
        Temperature tempGen = new MockupTemperatureRandom();
        this.region = region;
        this.temp = tempGen.getTemperature(region, range);
    }

    public double getTemp() {
        return temp;
    }

    public double getTempK() {
        if (tempK == null) tempK = temp + 273.15d;
        return tempK;
    }

    public double getTempF() {
        if (tempF == null) tempF = (temp * 1.8d) + 32;
        return tempF;
    }

    public void reportTemperature (char scale) {
        double value = switch (scale) {
            case 'K' -> getTempK();
            case 'F' -> getTempF();
            default -> getTemp();
        };
        String scale_prefix = scale == 'K' ? "" : "°";
        System.out.printf("Current temperature in %s: %.2f%s%s\n", region, value, scale_prefix, scale);
    }
}
