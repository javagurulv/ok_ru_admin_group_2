package student_alexey_krenev.lesson_2_variables;

import java.util.Scanner;

public class Task_2_CalcScannerDouble {
    public static void main(String[] args) {
        System.out.println("Insert first int:");
        Scanner scanner1 = new Scanner(System.in);
        double firstNumber = scanner1.nextDouble();

        System.out.println("Insert second int:");
        Scanner scanner2 = new Scanner(System.in);
        double secondNumber = scanner2.nextDouble();

        System.out.println(firstNumber+secondNumber);

    }
}