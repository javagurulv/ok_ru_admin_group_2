package student_sergo_kurbanov.lesson_4.level_3;

import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int First = scanner.nextInt();
        System.out.print("Enter second number: ");
        int Second = scanner.nextInt();
        System.out.print("Enter third number: ");
        int Third = scanner.nextInt();

        boolean FirstEqSecond = (First == Second);
        boolean SecondEqThird = (Second == Third);
        boolean ThirstEqThird = (First == Third);

        if (FirstEqSecond && SecondEqThird && ThirstEqThird) {
            System.out.printf("\nAll numbers are equal");
        } else if (FirstEqSecond || SecondEqThird || ThirstEqThird) {
            System.out.printf("\nNeither all are equal or different");
        } else {
            System.out.printf("\nAll numbers are different");
        }
    }
}
