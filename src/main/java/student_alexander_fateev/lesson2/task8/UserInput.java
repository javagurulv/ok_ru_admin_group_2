package student_alexander_fateev.lesson2.task8;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Username: ");
        String userName = scan.nextLine();
        System.out.print("Hello " + userName);
    }
}
