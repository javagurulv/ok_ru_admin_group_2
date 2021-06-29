package teacher.lesson_6_arrays_while_loop.lessoncode;

import java.util.Scanner;

class BreakExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		while (i < 100) {
			System.out.println("i = " + i);
			i++;
		}

		int number = 0;
		while (number != 5) {
			System.out.println("Infinite Loop!");
			System.out.print("Enter magic number: ");
			number = sc.nextInt();
		}


		while(true) {
			System.out.println("Infinite Loop!");
			System.out.print("Enter magic number: ");
			int userNumber = sc.nextInt();
			if (userNumber == 5) {
				break;
			}
		}
		System.out.print("End!");
	}



}
