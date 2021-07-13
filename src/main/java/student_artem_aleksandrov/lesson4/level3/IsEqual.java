package student_artem_aleksandrov.lesson4.level3;

import student_artem_aleksandrov.lesson4.GetNumbers;


/*
Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.

 */
public class IsEqual {
    public static void main(String[] args) {
        int[] numbers = GetNumbers.getNumbers(3);

        if (numbers[0] == numbers[1] & numbers[1] == numbers[2]){
            System.out.println("All numbers are equal");
        }
        else if (numbers[0] != numbers[1] & numbers[1] != numbers[2] & numbers[0] != numbers[2]) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }

}
