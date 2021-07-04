package student_dmitry_drozdetsky.lesson_3.level2.t9;

import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scan.nextLine();

        System.out.println("Hi " + userName + "!");
    }
}
