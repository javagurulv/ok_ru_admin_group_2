package student_ilya_schanikov.lesson_4.level_1;

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        int number;
        System.out.println("Please, enter number:");
        Scanner userNumber = new Scanner(System.in);
        number = userNumber.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("We are from Earth, sorry!");
        }

    }
}
