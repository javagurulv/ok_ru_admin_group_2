package student_artem_aleksandrov.lesson4.level3;

import student_artem_aleksandrov.lesson4.GetNumbers;

public class Max {
    public static void main(String[] args) {
        int[] numbers = new GetNumbers().getNumbers(3);

        int max = numbers[0];

        for (int i=1; i<3; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Max: %s".formatted(max));
    }
}
