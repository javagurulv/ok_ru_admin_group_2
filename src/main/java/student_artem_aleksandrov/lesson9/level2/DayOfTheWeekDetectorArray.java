package student_artem_aleksandrov.lesson9.level2;

public class DayOfTheWeekDetectorArray implements DayOfTheWeekDetector {

    String[] week = {
            "",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday",
    };

    @Override
    public String detectDayName(int number) {
        if ( number < 1 || number > 7 ) {
            return "Please input a valid number between 1 and 7";
        }
        return week[number];
    }

}
