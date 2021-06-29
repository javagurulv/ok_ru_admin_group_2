package student_andrey_domas.lesson4.level7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class LeapYear {
    public boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
