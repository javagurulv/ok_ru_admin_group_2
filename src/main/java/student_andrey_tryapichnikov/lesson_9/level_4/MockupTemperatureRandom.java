package student_andrey_tryapichnikov.lesson_9.level_4;

import java.util.Random;

public class MockupTemperatureRandom implements Temperature {
    @Override
    public double getTemperature(Region region, int range) {
        Random rng = new Random();
        return rng.nextInt(range);
    }
}
