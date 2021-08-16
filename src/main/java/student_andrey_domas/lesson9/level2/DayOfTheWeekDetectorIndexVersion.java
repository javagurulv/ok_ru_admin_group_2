package student_andrey_domas.lesson9.level2;

public class DayOfTheWeekDetectorIndexVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String daysOfWeek[] = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
        };
        try {
            return daysOfWeek[number - 1];
        } catch (IndexOutOfBoundsException e) {
            return "Please input a valid number between 1 and 7";
        }
    }
}
