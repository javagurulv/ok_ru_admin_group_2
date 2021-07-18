package student_andrey_tryapichnikov.lesson_4.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 == 0) return year % 400 == 0;
        return true;
    }

}