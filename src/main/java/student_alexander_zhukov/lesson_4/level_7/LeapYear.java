package student_alexander_zhukov.lesson_4.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        else if (year % 100 == 0) {
            return year % 400 == 0;
        }
        else {
            return true;
        }
    }
}
