package student_artem_aleksandrov.lesson9.level2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorTest {

    @Test
    public void detectDayNameArray() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector() {
            @Override
            public String detectDayName(int number) {
                DayOfTheWeekDetectorArray dayOfTheWeekDetectorArray = new DayOfTheWeekDetectorArray();
                return dayOfTheWeekDetectorArray.detectDayName(1);
            };
        };
        assertEquals(dayOfTheWeekDetector.detectDayName(1), "Monday");
    }

    @Test
    public void detectDayNameIf() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector() {
            @Override
            public String detectDayName(int number) {
                DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
                return dayOfTheWeekDetectorIfVersion.detectDayName(1);
            };
        };
        assertEquals(dayOfTheWeekDetector.detectDayName(1), "Monday");
    }
}