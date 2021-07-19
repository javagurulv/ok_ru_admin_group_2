package teacher.lesson_9_interfaces.lessoncode;

import java.math.BigDecimal;

class InsurancePolicyCalculatorImpl implements InsurancePolicyCalculator {

	@Override
	public BigDecimal calculate(Policy policy) {
		return new BigDecimal("1.0");
	}

}
