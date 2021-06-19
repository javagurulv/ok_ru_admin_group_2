package student_sergo_kurbanov.lesson_3.level_2;

import java.util.Scanner;

class ReadLine {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
