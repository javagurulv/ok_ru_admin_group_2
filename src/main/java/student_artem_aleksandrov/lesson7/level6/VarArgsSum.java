package student_artem_aleksandrov.lesson7.level6;

public class VarArgsSum {

    public int addAll(int ... numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}
