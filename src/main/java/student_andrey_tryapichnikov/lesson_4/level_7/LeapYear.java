package student_andrey_tryapichnikov.lesson_4.level_7;

class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 == 0) return year % 400 == 0;
        return true;
    }

}