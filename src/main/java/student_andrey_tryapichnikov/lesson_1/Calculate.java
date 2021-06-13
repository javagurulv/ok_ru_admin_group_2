package student_andrey_tryapichnikov.lesson_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Calculate {
    public static double calculate(String action, double[] values) {
        switch (action) {
            case "add" -> {
                return Addition.add(values);
            }
            case "multiply" -> {
                return Multiplication.multiply(values);
            }
            case "subtract" -> {
                System.out.println("Only the first two values will be used!");
                return Subtraction.subtract(values[0], values[1]);
            }
            case "divide" -> {
                System.out.println("Only the first two values will be used!");
                return Division.divide(values[0], values[1]);
            }
            default -> {
                System.err.println("Wrong operation!");
                System.exit(1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        double[] values;
        String action;
        if (args.length >= 3) {
            action = args[0];
            values = new double[args.length - 1];
            for (int a = 1; a < args.length; a++) values[a-1] = Double.parseDouble(args[a]);
        } else {
            action = "add";
            values = new double[]{1, 2};
        }
        System.out.println(calculate(action, values));
    }
}
