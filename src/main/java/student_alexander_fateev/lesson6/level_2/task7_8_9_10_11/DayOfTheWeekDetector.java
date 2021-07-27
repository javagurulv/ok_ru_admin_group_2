package student_alexander_fateev.lesson6.level_2.task7_8_9_10_11;

import java.util.Scanner;

class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        switch (dayNumber) {
            case 1 -> { return "Monday"; }
            case 2 -> { return "Tuesday"; }
            case 3 -> { return "Wednesday"; }
            case 4 -> { return "Thursday"; }
            case 5 -> { return "Friday"; }
            case 6 -> { return "Saturday"; }
            case 7 -> { return "Sunday"; }
            default -> { return "Not correct day number"; }
        }
    }
}
