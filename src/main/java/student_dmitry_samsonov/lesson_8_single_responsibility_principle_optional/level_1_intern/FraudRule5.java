package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudRule5 extends FraudRule {

    public FraudRule5() {
        super("Rule 5");
    }

    public FraudDetectionResult isFraud(Transaction t) {
        boolean result = t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000;
        return new FraudDetectionResult(result, this.getRuleName());

    }

}
