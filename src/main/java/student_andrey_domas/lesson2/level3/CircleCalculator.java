package student_andrey_domas.lesson2.level3;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        System.out.print("Radius: ");
        Scanner scnr = new Scanner(System.in);
        final float R = scnr.nextFloat();
        System.out.println("Perimeter: " + 2 * Math.PI * R);
        System.out.println("Area: " + Math.PI * Math.pow(R, 2));
    }
}
