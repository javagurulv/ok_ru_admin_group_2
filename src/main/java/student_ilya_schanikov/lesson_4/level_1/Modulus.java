package student_ilya_schanikov.lesson_4.level_1;

import java.util.Scanner;

class Modulus {
    public static void main(String[] args) {
        int number;
        System.out.println("Please, enter number:");
        Scanner userNumber = new Scanner(System.in);
        number = userNumber.nextInt();
        if (number == 0) {
            System.out.println("Number is zero!");
        } else if (number > 0) {
            System.out.println("Number is positive!");
        } else {
            System.out.println("Number is negative!");
        }
    }
}
