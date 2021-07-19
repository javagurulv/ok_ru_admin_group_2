package teacher.lesson_9_interfaces.lessoncode;

import java.math.BigDecimal;

public interface InsurancePolicyCalculator {

	BigDecimal calculate(Policy policy);

	default int sum(int num1, int num2) {
		return num1 + num2;
	}

}
