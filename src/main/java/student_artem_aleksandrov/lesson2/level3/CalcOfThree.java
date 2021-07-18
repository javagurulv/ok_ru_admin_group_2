package student_artem_aleksandrov.lesson2.level3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalcOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input three numbers:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        List<Integer> numbers = Arrays.asList(number1, number2, number3);

        float sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        System.out.println("Average is %,.2f".formatted(sum / 3));
    }
}
