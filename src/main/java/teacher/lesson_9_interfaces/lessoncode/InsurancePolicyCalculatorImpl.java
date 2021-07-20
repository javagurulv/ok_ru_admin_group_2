package teacher.lesson_9_interfaces.lessoncode;

import java.math.BigDecimal;

class InsurancePolicyCalculatorImpl
		extends Object
		implements InsurancePolicyCalculator {

	@Override
	public BigDecimal calculate(Policy policy) {
		return new BigDecimal("1.0");
	}

}
