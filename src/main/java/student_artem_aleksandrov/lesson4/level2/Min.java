package student_artem_aleksandrov.lesson4.level2;

import student_artem_aleksandrov.lesson4.GetNumbers;

public class Min {

    public static void main(String[] args) {

        int[] numbers = GetNumbers.getNumbers(2);

        System.out.println(Math.min(numbers[0], numbers[1]));
    }
}
