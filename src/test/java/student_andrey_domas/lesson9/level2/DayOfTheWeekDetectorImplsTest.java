package student_andrey_domas.lesson9.level2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DayOfTheWeekDetectorImplsTest {

    String daysOfWeek[] = {
            "Please input a valid number between 1 and 7",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday",
            "Please input a valid number between 1 and 7",
    };

    @Test
    public void dayOfTheWeekDetectorTest() {
        var dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        var dayOfTheWeekDetectorIndexVersion = new DayOfTheWeekDetectorIndexVersion();
        var dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        for (int i = 0; i < daysOfWeek.length; i++) {
            Assert.assertEquals(daysOfWeek[i], dayOfTheWeekDetectorIfVersion.detectDayName(i));
            Assert.assertEquals(daysOfWeek[i], dayOfTheWeekDetectorIndexVersion.detectDayName(i));
            Assert.assertEquals(daysOfWeek[i], dayOfTheWeekDetectorSwitchVersion.detectDayName(i));
        }
    }
}
