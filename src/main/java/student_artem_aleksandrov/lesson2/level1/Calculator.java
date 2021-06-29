// This Calculator do specific action. Not all

package student_artem_aleksandrov.lesson2.level1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String unsupportedOperator = "This operator unsupported";

        String welcomeMessage = "Calculator welcome you. Please input first number, then second:";

        System.out.println("What math action you want?:");
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();

        System.out.println(welcomeMessage);

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        switch (operation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println(unsupportedOperator);
        }



    }
}
