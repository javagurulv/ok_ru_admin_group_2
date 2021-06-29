package student_alexander_fateev.lesson4.level_1.task3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfWeek {
    private int day;
    private String dayVerbose; // зачем это свойство? Ведь в intToDayName() итак значение возвращается из метода.

    DayOfWeek (int day) {
        this.day = day;
    }

    String intToDayName () {
        switch (day) {
            case(1):
                dayVerbose = "Monday";
                break;
            case(2):
                dayVerbose = "Tuesday";
                break;
            case(3):
                dayVerbose = "Wednsday";
                break;
            case(4):
                dayVerbose = "Thursday";
                break;
            case(5):
                dayVerbose = "Friday";
                break;
            case(6):
                dayVerbose = "Saturday";
                break;
            case(7):
                dayVerbose = "Sunday";
                break;
            default:
                dayVerbose = "I don't know what do you want";
                break;
        }

        return dayVerbose;
    }
}
