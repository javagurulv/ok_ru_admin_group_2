package student_dmitry_samsonov.lesson_6.level_2_intern;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String color;
        switch (dayNumber) {
            case 1 -> color = "Monday";
            case 2 -> color = "Tuesday";
            case 3 -> color = "Wednesday";
            case 4 -> color = "Thursday";
            case 5 -> color = "Friday";
            case 6 -> color = "Saturday";
            case 7 -> color = "Sunday";
            default -> color = "Not correct day number";
        }
        return color;
    }

}
