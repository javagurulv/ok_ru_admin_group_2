package student_artem_khokhlov.lesson_2.task_1;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        number1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        number2= scan.nextInt();

        System.out.println("Summ result: " + (number1 + number2));
        System.out.println("Multiplication result: " + (number1 * number2));
        System.out.println("Subtraction result: " + (number1 - number2));
        if (number2 != 0){
            System.out.println("Division result: " + (number1/number2));
        }
        else
        {
            System.out.println("Can not divide by 0.");
        }
    }
}
