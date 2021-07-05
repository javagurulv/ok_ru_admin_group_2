package student_artem_aleksandrov.lesson3;

import java.util.Scanner;

public class HelloUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");

    }
}
