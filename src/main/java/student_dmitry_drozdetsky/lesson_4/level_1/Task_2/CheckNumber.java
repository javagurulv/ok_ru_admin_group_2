package student_dmitry_drozdetsky.lesson_4.level_1.Task_2;

import java.util.Scanner;

class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        var userNumber = scanner.nextInt();

        if (userNumber < 0) {
            System.out.println(userNumber + " is negative.");
        } else if (userNumber == 0) {
            System.out.println(userNumber + " is zero.");
        } else {
            System.out.println(userNumber + " is positive.");
        }
    }
}
