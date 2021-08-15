package student_andrey_tryapichnikov.lesson_9.level_2;

import java.util.LinkedList;
import java.util.List;

public class DayOfTheWeekDetectorListVersion implements DayOfTheWeekDetector {
    private final List<String> dayList = new LinkedList<>() {{
        add("Monday");
        add("Tuesday");
        add("It's Wednesday my dudes");
        add("Thursday");
        add("Friday");
        add("Saturday");
        add("Sunday");
    }};

    @Override
    public String detectDayName(int day) {
        try {
            return dayList.get(day - 1);
        } catch (IndexOutOfBoundsException err) {
            return "Wrong number";
        }
    }
}
