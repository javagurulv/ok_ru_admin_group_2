package student_dmitry_samsonov.lesson_4.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }

}
