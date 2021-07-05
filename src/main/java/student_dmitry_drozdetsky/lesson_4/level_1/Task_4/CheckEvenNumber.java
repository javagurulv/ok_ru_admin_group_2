package student_dmitry_drozdetsky.lesson_4.level_1.Task_4;

import java.util.Scanner;

class CheckEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        var userNumber = scanner.nextInt();

        if ((userNumber % 2 ) == 0 ) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is not even");
        }
    }
}