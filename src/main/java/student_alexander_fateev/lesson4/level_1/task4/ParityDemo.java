package student_alexander_fateev.lesson4.level_1.task4;

import java.util.Scanner;

class ParityDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input integer: ");
        int number = scan.nextInt();

        Parity myNumber = new Parity(number);

        if (myNumber.isEvenNumber()) {
            System.out.println("This is even number");
        }
        else {
            System.out.println("This is odd number");
        }
    }
}
