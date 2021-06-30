package student_ilya_schanikov.lesson_2.level_3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int x,y,z;
        float i;
        Scanner incomingNumber = new Scanner(System.in);
        System.out.println("Enter first number:");
        x = incomingNumber.nextInt();
        System.out.println("Enter second number:");
        y = incomingNumber.nextInt();
        System.out.println("Enter third number:");
        z = incomingNumber.nextInt();
        i = (float) (x + y + z)/3;
        System.out.println("student_ilya_schanikov.lesson_2.level_3.Average is: " + i);
    }
}
