package teacher.lesson_4_if_statement.lessoncode;

class Calculator {

	int result;

	public int sum(int firstNumber,
				   int secondNumber) {
		result = firstNumber + secondNumber;
		return result;
	}

	boolean isPositive(int number) {
		return number > 0;
	}

	boolean isNegative(int number) {
		return number < 0;
	}

}
