package student_andrey_tryapichnikov.lesson_9.level_2;

public class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number) {
        return switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "It's Wednesday my dudes";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Wrong number";
        };
    }
}
