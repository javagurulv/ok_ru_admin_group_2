package student_andrey_tryapichnikov.lesson_4.level_1;

import student_andrey_tryapichnikov.boilerplate.ScannerQuery;

import java.util.Scanner;

// don't forget to try it with 3 ;)
public class WeekDayDemo {
    public static void main(String[] args) {
        var number = ScannerQuery.queryNumberDefault(1)[0];

        var day = WeekDay.getDayName(number);

        if (day == null) {
            System.out.println("Wrong number!");
            System.exit(1);
        }

        System.out.println(day);
    }
}
