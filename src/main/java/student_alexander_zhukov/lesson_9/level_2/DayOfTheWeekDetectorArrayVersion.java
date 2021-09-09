package student_alexander_zhukov.lesson_9.level_2;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName ( int number) {
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number < 8) {
            return days[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
