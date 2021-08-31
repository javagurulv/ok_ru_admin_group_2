package student_andrey_tryapichnikov.lesson_9.level_4;

public class ForecastDemo {
    public static void main(String[] args) {
        Forecast forecast = new Forecast(Region.Moscow, 32);
        forecast.reportTemperature('C');
        forecast.reportTemperature('K');
        forecast.reportTemperature('F');
    }
}
