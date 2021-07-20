package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudRule3 extends FraudRule {

    public FraudRule3() {
        super("Rule 3");
    }

    public FraudDetectionResult isFraud(Transaction t) {
        boolean result = t.getTrader().getCity().equals("Sidney");
        return new FraudDetectionResult(result, this.getRuleName());
    }
}