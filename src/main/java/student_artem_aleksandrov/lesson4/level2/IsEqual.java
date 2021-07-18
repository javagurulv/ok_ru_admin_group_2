package student_artem_aleksandrov.lesson4.level2;

import student_artem_aleksandrov.lesson4.GetNumbers;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class IsEqual {
    public static void main(String[] args) {
        int[] numbers = GetNumbers.getNumbers(2);

        if (numbers[0] == numbers[1]) {
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Numbers are different");
        }
    }
}
