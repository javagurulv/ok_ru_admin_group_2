package student_sergo_kurbanov.lesson_4.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTestByYear("1. (year   % 4 != 0)", 2001, false);
        LeapYearTestByYear("2. (year % 100 != 0)", 2004, true);
        LeapYearTestByYear("3. (year % 400 == 0)", 400, true);
    }

    public static void LeapYearTestByYear(String testName, int year, boolean expectedResult) {
        LeapYear isLeapYear = new LeapYear();
        boolean realResult = isLeapYear.isLeapYear(year);
        System.out.printf("\nTest: %s. Year: %d. Expected: %b. Result: %b: %s",
                testName, year, realResult, expectedResult, expectedResult == realResult ? "OK" : "FAIL");
    }
}
