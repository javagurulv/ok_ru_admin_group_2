package teacher.lesson_9_interfaces.lessoncode;

import java.math.BigDecimal;

public class InsurancePolicyCalculatorV2Impl
		implements InsurancePolicyCalculator {

	@Override
	public BigDecimal calculate(Policy policy) {
		return new BigDecimal("2.0");
	}

}
