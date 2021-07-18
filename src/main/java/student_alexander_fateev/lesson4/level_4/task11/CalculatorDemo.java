package student_alexander_fateev.lesson4.level_4.task11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int firstNumber = scan.nextInt();
        System.out.print("Input second integer: ");
        int secondNumber = scan.nextInt();

        Calculator myCalc = new Calculator();

        String sumExpression = firstNumber + " + " + secondNumber + " = ";
        System.out.println(sumExpression + myCalc.sum(firstNumber, secondNumber));

        String substructExpression = firstNumber + " - " + secondNumber + " = ";
        System.out.println(substructExpression + myCalc.substruct(firstNumber, secondNumber));

        String multiplicationExpression = firstNumber + " * " + secondNumber + " = ";
        System.out.println(multiplicationExpression + myCalc.multiplication(firstNumber, secondNumber));

        String divisionExpression = firstNumber + " / " + secondNumber + " = ";
        System.out.println(divisionExpression + myCalc.division(firstNumber, secondNumber));
    }
}
