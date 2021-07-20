package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudRule1 extends FraudRule {

    public FraudRule1() {
        super("Rule 1");
    }

    public FraudDetectionResult isFraud(Transaction t) {
        boolean result = t.getTrader().getFullName().equals("Pokemon");
        return new FraudDetectionResult(result, this.getRuleName());
    }

}