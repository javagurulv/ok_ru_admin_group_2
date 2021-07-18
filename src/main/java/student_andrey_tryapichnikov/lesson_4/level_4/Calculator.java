package student_andrey_tryapichnikov.lesson_4.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Calculator {
    public static int sum(int numeroUno, int numeroDos) {
        return numeroUno + numeroDos;
    }

    public static int sub(int numeroUno, int numeroDos) {
        return numeroUno - numeroDos;
    }

    public static int mul(int numeroUno, int numeroDos) {
        return numeroUno * numeroDos;
    }

    public static int div(int numeroUno, int numeroDos) {
        return numeroUno / numeroDos;
    }

    public static boolean isEven(int numero) {
        return numero % 2 == 0;
    }

    public static int max(int[] numeros) {
        int result = numeros[0];
        for (int i: numeros) if (i > result) result = i;
        return result;
    }

    public static int maxOfTwoNumbers(int numeroUno, int numeroDos) {
        int[] numeros = {numeroUno, numeroDos};
        return max(numeros);
    }

    public static int maxOfThreeNumbers(int numeroUno, int numeroDos, int numeroTres) {
        int[] numeros = {numeroUno, numeroDos, numeroTres};
        return max(numeros);
    }
}
