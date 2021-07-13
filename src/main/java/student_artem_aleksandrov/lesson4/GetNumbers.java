package student_artem_aleksandrov.lesson4;

import java.util.Scanner;

public class GetNumbers {


    public static int[] getNumbers( int num ) {

        int[] numbers = new int[num];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input %s numbers: ".formatted(num));

        for ( int i=0 ; i < num ; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

}
