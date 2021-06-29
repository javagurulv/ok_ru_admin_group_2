package student_dmitry_samsonov.lesson_2.level_1;
import java.util.Scanner;

class CalcDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first double: ");
        var firstNumber = scanner.nextDouble();
        System.out.println("Enter second double: ");
        var secondNumber = scanner.nextDouble();

        System.out.println("Number received: " + firstNumber + ", " + secondNumber);

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        if (secondNumber == 0D) {
            System.out.println("Division by zero impossible");
        } else {
            System.out.println("Division: " + (firstNumber / secondNumber));
        }
    }
}
