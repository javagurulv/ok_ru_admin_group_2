package student_sergo_kurbanov.lesson_4.level_3;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int First = scanner.nextInt();
        System.out.print("Enter second number: ");
        int Second = scanner.nextInt();
        System.out.print("Enter third number: ");
        int Third = scanner.nextInt();

        boolean firstLessSecond = (First < Second);
        boolean secondLessThird = (Second < Third);
        boolean firstGtSecond = (First > Second);
        boolean secondGtThird = (Second > Third);


        if (firstLessSecond && secondLessThird) {
            System.out.printf("\nincreasing");
        } else if (firstGtSecond && secondGtThird) {
            System.out.printf("\ndecreasing");
        } else {
            System.out.printf("\nNeither increasing or decreasing order");
        }
    }
}
