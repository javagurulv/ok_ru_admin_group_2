package student_andrey_tryapichnikov.lesson_4.level_7;

class LeapYearTest {
    public static void main(String[] args) {
        leapYearTest(2000);
        leapYearTest(1900);
        leapYearTest(1904);
        leapYearTest(1905);
    }
    private static void leapYearTest(int year) {
        var leapYear = new LeapYear();
        var leapYearMsg = leapYear.isLeapYear(year) ? "%s is a leap yearn\n" : "%s is not a leap year\n";
        System.out.printf(leapYearMsg, year);
    }
}
