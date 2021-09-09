package student_dmitry_samsonov.lesson_11_exceptions.level_3_junior;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        System.out.println("SUCCESS: " + inputInteger());
    }
    public static Integer inputInteger(){
        while (true) {
            System.out.println("Enter integer:");
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect input type");
            }
            return inputInteger();
        }
    }
}
