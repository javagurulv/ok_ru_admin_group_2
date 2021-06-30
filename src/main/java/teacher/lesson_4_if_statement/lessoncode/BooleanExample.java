package teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

class BooleanExample {

	public static void main(String[] args) {

		boolean isTrue = 3 < 0;

		isTrue = true;
		isTrue = false;

		int number = 10;

		boolean isPositive = number > 0;
		System.out.println("Positive = " + isPositive);

		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		if (number != 50) {

		}

		// <, <=, >, >=, !=, ==
		if (number > 0) {
			System.out.println("Number is Positive!");
			System.out.println("Number is Positive sdfsdfs!");
			System.out.println("Number is Positive sdfsdfs!");
			System.out.println("Number is Positive sdfsdfs!");
			System.out.println("Number is Positive sdfsdfs!");
		}

		if (number == 10) {
			System.out.println("Number is Positive sdfsdfs!");
		}

		String str1 = new String("abc");
		String str2 = new String("abc");
		if (str1.equals(str2)) {  // true

		}

		// srt1 = 1000L;  str2 = 2000L;
		if (str1 == str2) {  // false

		}


		if (number > 0) {
			System.out.println("Number is Positive!");
			System.out.println("Number is Positive!");
			System.out.println("Number is Positive!");
		}

		if (number < 0) {
			System.out.println("Number is Negative!");
			System.out.println("Number is Negative!");
			System.out.println("Number is Negative!");
		}

		if (number == 0) {
			System.out.println("Number is Zero!");
			System.out.println("Number is Zero!");
			System.out.println("Number is Zero!");
		}

		if (number > 20) {
			System.out.println("Number > 20!");
		}


		if (number > 0) {
			System.out.println("Number is Positive!");
		} else {
			System.out.println("Number is Negative or Zero!");
		}

	}

}
