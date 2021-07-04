package student_alexey_gorbov.lesson_2;

import java.util.Scanner;

public class Task8Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, "+name+"!");
    }
}
