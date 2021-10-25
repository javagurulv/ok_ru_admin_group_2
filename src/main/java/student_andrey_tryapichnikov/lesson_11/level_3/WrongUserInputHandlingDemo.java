package student_andrey_tryapichnikov.lesson_11.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var number = readNumber(scanner);

        System.out.printf("Entered number %s", number);
    }

    static int readNumber(Scanner scanner) {
        System.out.print("Enter a number: ");

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            return readNumber(scanner);
        }
    }
}
