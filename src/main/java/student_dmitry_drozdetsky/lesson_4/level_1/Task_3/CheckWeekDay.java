package student_dmitry_drozdetsky.lesson_4.level_1.Task_3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CheckWeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weekly day number from 1 to 7: ");
        var userNumber = scanner.nextInt();

        switch (userNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Incorrect Day number");
        }
    }
}
