package student_dmitry_drozdetsky.lesson_2.level_2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        var userName = scan.nextLine();
        System.out.print("Hello " + userName);
    }
}
