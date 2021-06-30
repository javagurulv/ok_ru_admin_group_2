package student_alexander_fateev.lesson4.level_2.task7;

import java.util.Scanner;

class CompareDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int firstNumber = scan.nextInt();
        System.out.print("Input first integer: ");
        int secondNumber = scan.nextInt();

        Compare compareInts = new Compare(firstNumber, secondNumber);
        if (compareInts.isEqual()) {
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Numbers are different");
        }
    }
}
