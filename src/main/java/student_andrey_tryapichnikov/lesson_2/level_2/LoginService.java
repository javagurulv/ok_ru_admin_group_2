package student_andrey_tryapichnikov.lesson_2.level_2;

import java.util.Scanner;

public class LoginService {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("You can login!");
        System.out.print("Enter login: ");
        var login = scanner.nextLine();
        System.out.printf("Hello %s!\n", login);
    }
}
