package student_alexander_fateev.lesson4.level_1.task3;

import java.util.Scanner;

public class DayOfWeekDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input integer: ");
        int day = scan.nextInt();

        DayOfWeek newDay = new DayOfWeek(day);
        System.out.println(newDay.intToDayName());
    }
}
