package student_andrey_tryapichnikov.lesson_2;
import student_andrey_tryapichnikov.lesson_1.*;
import java.util.Scanner;

public class CalculateInteractive {
    private static boolean contains(String[] input, String matchValue) {
        // A very simple function to test for value presence in an array.
        for (String a : input) if (a.equals(matchValue)) return true;
        return false;
    }

    public static void main(String[] args) {
        double result = 0;
        double[] results = new double[4];
        String[] actions = {"add", "sub", "mul", "div", "all"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Action? (add, sub, mul, div, all)");
        String action = scanner.nextLine();
        if (! contains(actions, action)) {
            System.err.println("Unsupported action!");
            System.exit(1);
        }
        System.out.println("Enter two numbers:");
        double value1 = scanner.nextInt();
        double value2 = scanner.nextInt();
        double[] values = {value1, value2};
        switch (action) {
            case "add" -> result = Addition.add(values);
            case "sub" -> result = Subtraction.subtract(value1, value2);
            case "mul" -> result = Multiplication.multiply(values);
            case "div" -> result = Division.divide(value1, value2);
            /* Since the default behaviour for the homework program to print out results for all operations, make a
               specific option that does exactly that. It's a bit sad that we can't make it more versatile. */
            case "all" -> {
                results[0] = Addition.add(values);
                results[1] = Subtraction.subtract(value1, value2);
                results[2] = Multiplication.multiply(values);
                results[3] = Division.divide(value1, value2);
            }
        }
        if (action.equals("all")) {
            for (int a = 0; a < results.length; a++) {
                System.out.printf("%s result: %s\n", actions[a], results[a]);
            }
        } else {
            // somehow IDE warns about result not being initialized even with default in switch statement, weird
            System.out.printf("Result: %s\n", result);
        }
    }
}
