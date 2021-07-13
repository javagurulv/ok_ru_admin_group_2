package student_andrey_domas.lesson6.level2;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DayOfTheWeekDetectorTest {

    private Map<Integer, String> weekDaysMap;
    private DayOfTheWeekDetector dotwd;

    @Before
    public void setup() {
        dotwd = new DayOfTheWeekDetector();
        weekDaysMap = Map.ofEntries(
                Map.entry(1, "Monday"),
                Map.entry(2, "Tuesday"),
                Map.entry(3, "Wednesday"),
                Map.entry(4, "Thursday"),
                Map.entry(5, "Friday"),
                Map.entry(6, "Saturday"),
                Map.entry(7, "Sunday")
        );
    }

    @Test
    public void findDayOfTheWeekTest() {
        for (int i = -50; i <= 50; i++) {
            String detectedDay = dotwd.findDayOfTheWeek(i);
            String expected = weekDaysMap.getOrDefault(i, "Not correct day number");
            assert expected.equals(detectedDay) : "findDayOfTheWeek() failed";
        }
    }
}
