package student_alexander_zhukov.lesson_2.level_3.task_10;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Input Radius (double): ");
        double radius = myInput.nextDouble();

        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*Math.pow(radius,2);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
