package student_dmitry_samsonov.lesson_4.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.nonLeapTest();
        leapYearTest.leapTest();
        leapYearTest.leap1Test();
        leapYearTest.nonLeap1Test();
    }
    void nonLeapTest() {
        LeapYear year = new LeapYear();
        int testYear = 2001;
        boolean expectedResult = false;
        boolean result = year.isLeapYear(testYear);
        if (result == expectedResult) {
            System.out.println("2001 non leap test = OK");
        } else {
            System.out.println("2001 non leap test = FAIL");
        }
    }
    void leapTest() {
        LeapYear year = new LeapYear();
        int testYear = 2048;
        boolean expectedResult = true;
        boolean result = year.isLeapYear(testYear);
        if (result == expectedResult) {
            System.out.println("2048 leap test = OK");
        } else {
            System.out.println("2048 leap test = FAIL");
        }
    }
    void leap1Test() {
        LeapYear year = new LeapYear();
        int testYear = 2000;
        boolean expectedResult = true;
        boolean result = year.isLeapYear(testYear);
        if (result == expectedResult) {
            System.out.println("2000 leap test = OK");
        } else {
            System.out.println("2000 leap test = FAIL");
        }
    }
    void nonLeap1Test() {
        LeapYear year = new LeapYear();
        int testYear = 100;
        boolean expectedResult = false;
        boolean result = year.isLeapYear(testYear);
        if (result == expectedResult) {
            System.out.println("100 non leap test = OK");
        } else {
            System.out.println("100 non leap test = FAIL");
        }
    }


}
