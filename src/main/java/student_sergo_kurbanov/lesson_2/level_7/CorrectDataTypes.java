package student_sergo_kurbanov.lesson_2.level_7;

public class CorrectDataTypes {
    public static void main(String[] args) {
        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        float sum = (float) numberOne + (float) numberTwo;
        System.out.println("Sum = " + sum);

        // Using "wide" choice
        System.out.println("Wide Sum = " + (numberOne + numberTwo));
    }
}
