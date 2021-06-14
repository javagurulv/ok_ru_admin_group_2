package student_alexander_fateev.lesson2.level_3.task10;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Radius = ");
        double radius = scan.nextDouble();

        System.out.print("Perimetr = " + (2*Math.PI*radius) + "\n");
        System.out.print("Area = " + (Math.PI*(radius*radius)));
    }
}