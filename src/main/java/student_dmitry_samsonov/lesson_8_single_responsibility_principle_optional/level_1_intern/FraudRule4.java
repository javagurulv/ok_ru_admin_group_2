package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudRule4 extends FraudRule {

    public FraudRule4() {
        super("Rule 4");
    }

    public FraudDetectionResult isFraud(Transaction t) {
        boolean result = t.getTrader().getCountry().equals("Jamaica");
        return new FraudDetectionResult(result, this.getRuleName());
    }
}
