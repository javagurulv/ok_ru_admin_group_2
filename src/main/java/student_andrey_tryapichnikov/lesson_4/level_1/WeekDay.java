package student_andrey_tryapichnikov.lesson_4.level_1;

public class WeekDay {
    public static String getDayName(int daynumber) {
        String day;
        switch (daynumber) {
            case 1 -> day = "Mondey";
            case 2 -> day = "Tuesday";
            case 3 -> day = "It is Wednesday, my dudes";
            case 4 -> day = "Thursday";
            case 5 -> day = "Friday";
            case 6 -> day = "Saturday";
            case 7 -> day = "Sunday";
            default -> day = null;
        }
        return day;
    }
}
