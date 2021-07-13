package student_artem_aleksandrov.lesson4.level3;

import student_artem_aleksandrov.lesson4.GetNumbers;

/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are iСоздайте класс Calculator. В этом классе создайте методы
для сложения, вычитания, деления и умножения двух целых чисел.

Подсказка:

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // реализуйте по аналогии оставшиеся методы

}n increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.

 */
public class CheckOrder {
    public static void main(String[] args) {
        int[] numbers = GetNumbers.getNumbers(3);

        if (numbers[0] > numbers[1] & numbers[1] > numbers[2]) {
            System.out.println("decreasing");
        } else if (numbers[0] < numbers[1] & numbers[1] < numbers[2]) {
            System.out.println("increasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
