package student_dmitry_samsonov.lesson_6.level_2_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        printTestResult("1", testFindDayOfTheWeek(1).equals("Monday"));
        printTestResult("2", testFindDayOfTheWeek(2).equals("Tuesday"));
        printTestResult("3", testFindDayOfTheWeek(3).equals("Wednesday"));
        printTestResult("4", testFindDayOfTheWeek(4).equals("Thursday"));
        printTestResult("5", testFindDayOfTheWeek(5).equals("Friday"));
        printTestResult("6", testFindDayOfTheWeek(6).equals("Saturday"));
        printTestResult("7", testFindDayOfTheWeek(7).equals("Sunday"));
        printTestResult("8", testFindDayOfTheWeek(8).equals("Not correct day number"));
    }
    static String testFindDayOfTheWeek(int dayNumber) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        return detector.findDayOfTheWeek(dayNumber);
    }
    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }
}
