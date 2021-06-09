package student_alexey_krenev.lesson_2_variables;

import java.util.Scanner;

public class Task_8_HelloName {
    public static void main(String[] args) {
        System.out.println("Enter name: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello, "+name+"!");
    }
}
