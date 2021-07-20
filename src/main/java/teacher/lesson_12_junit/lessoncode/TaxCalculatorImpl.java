package teacher.lesson_12_junit.lessoncode;

public class TaxCalculatorImpl implements TaxCalculator {

	@Override
	public double calculate(double income) {
		return income * 0.25;
	}

}
