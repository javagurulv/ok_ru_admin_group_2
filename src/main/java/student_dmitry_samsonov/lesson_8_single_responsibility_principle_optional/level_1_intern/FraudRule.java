package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

abstract class FraudRule {


    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract FraudDetectionResult isFraud(Transaction t);

    public String getRuleName() {
        return ruleName;
    }
}