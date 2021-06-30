package student_ilya_schanikov.lesson_2.level_3;

import java.util.Scanner;
import java.lang.Math;

public class Circle {
    public static void main(String[] args) {
        float x;
        Scanner incomingNumber = new Scanner(System.in);
        System.out.println("Enter circle radius:");
        x = incomingNumber.nextFloat();
        System.out.println("Perimeter is: " + (x * 2 * Math.PI));
        System.out.println("Area is: " + (x * x * Math.PI));
    }
}
