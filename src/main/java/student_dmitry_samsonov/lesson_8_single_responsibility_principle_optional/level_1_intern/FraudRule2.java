package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudRule2 extends FraudRule {

    public FraudRule2() {
        super("Rule 2");
    }

    public FraudDetectionResult isFraud(Transaction t) {
        boolean result = t.getAmount() > 1000000;
        return new FraudDetectionResult(result, this.getRuleName());
    }

}