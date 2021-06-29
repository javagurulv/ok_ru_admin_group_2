package student_sergo_kurbanov.lesson_4.level_3;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int First = scanner.nextInt();
        System.out.print("Enter second number: ");
        int Second = scanner.nextInt();
        System.out.print("Enter third number: ");
        int Third = scanner.nextInt();

        boolean FirstLessSecond = (First < Second);
        boolean SecondLessThird = (Second < Third);
        boolean FirstGtSecond = (First > Second);
        boolean SecondGtThird = (Second > Third);


        if (FirstLessSecond && SecondLessThird) {
            System.out.printf("\nincreasing");
        } else if (FirstGtSecond && SecondGtThird) {
            System.out.printf("\ndecreasing");
        } else {
            System.out.printf("\nNeither increasing or decreasing order");
        }
    }
}
