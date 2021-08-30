package student_andrey_tryapichnikov.lesson_9.level_4;

public class MockupTemperatureHardcode implements Temperature {
    @Override
    public double getTemperature(Region region, int range) {
        return 25d;
    }
}
