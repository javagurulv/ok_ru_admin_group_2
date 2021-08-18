package student_dmitry_samsonov.lesson_9_interfaces.level_2_intern;

import java.util.ArrayList;
import java.util.List;

class DayOfTheWeekDetectorListVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        List<String> week = new ArrayList<String>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");
        if (number > 7 || number < 1) {
            return "Please input a valid number between 1 and 7";
        } else {
            number--;
            return(week.get(number));
        }
    }
}