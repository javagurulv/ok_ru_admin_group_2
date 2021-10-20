package student_alexander_zhukov.lesson_12.level_1;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    private BigDecimal minNal = BigDecimal.valueOf(20000);

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(minNal) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            return minNal.multiply(new BigDecimal("0.25")).add(income.subtract(minNal).multiply(new BigDecimal("0.4")));
        }

    }

}
