package student_alexander_zhukov.lesson_4.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest testLY = new LeapYearTest();

        testLY.testLeapYear(1840, true);
        testLY.testLeapYear(1952, true);
        testLY.testLeapYear(1780, true);
        testLY.testLeapYear(2016, true);
        testLY.testLeapYear(2021, false);
        testLY.testLeapYear(1985, false);
        testLY.testLeapYear(1837, false);
    }

    public void testLeapYear(int year, boolean answer) {
        LeapYear lyTest = new LeapYear();
        if (lyTest.isLeapYear(year) == answer) {
            System.out.println("Leap Year test - " + year + " = OK");
        }
        else {
            System.out.println("Leap Year test - " + year + " = FAIL");
        }
    }
}
