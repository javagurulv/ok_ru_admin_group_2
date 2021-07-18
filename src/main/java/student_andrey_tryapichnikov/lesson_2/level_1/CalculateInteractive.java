package student_andrey_tryapichnikov.lesson_2.level_1;
import student_andrey_tryapichnikov.lesson_1.Addition;
import student_andrey_tryapichnikov.lesson_1.Division;
import student_andrey_tryapichnikov.lesson_1.Multiplication;
import student_andrey_tryapichnikov.lesson_1.Subtraction;
import teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
public class CalculateInteractive {
    static final String RESULT_FMT = "%s equals: %s\n";
    static final String[] OPERATIONS = {"add", "sub", "mul", "div", "all"};

    static boolean is_valid_operation(String matchValue) {
        for (String operation : OPERATIONS) if (operation.equals(matchValue)) return true;
        return false;
    }

    private static void print_result(String operation, double[] values) {
        switch (operation) {
            case "add" -> System.out.printf(RESULT_FMT, "Sum", Addition.add(values));
            case "sub" -> System.out.printf(RESULT_FMT, "Difference", Subtraction.subtract(values[0], values[1]));
            case "mul" -> System.out.printf(RESULT_FMT, "Product", Multiplication.multiply(values));
            case "div" -> System.out.printf(RESULT_FMT, "Quotient", Division.divide(values[0], values[1]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Operation? %s\n", Arrays.stream(OPERATIONS).toList());
        String operation = scanner.nextLine();
        if (! is_valid_operation(operation)) {
            System.err.println("Unsupported operation!");
            System.exit(1);
        }

        System.out.println("Enter two numbers:");
        double[] values = new double[2];
        values[0] = scanner.nextDouble();
        values[1] = scanner.nextDouble();

        if (operation.equals("all")) {
            for (String available_operation : OPERATIONS) {
                print_result(available_operation, values);
            }
        } else {
            print_result(operation, values);
        }
    }
}
