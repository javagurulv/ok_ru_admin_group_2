package student_alexey_krenev.lesson_4.level_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfWeek {

    public static void main(String[] args) {
        System.out.println("Insert day number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }

}
