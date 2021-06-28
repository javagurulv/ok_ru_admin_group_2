package student_andrey_domas.lesson4.level7;

public class LeapYear {
    public boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
