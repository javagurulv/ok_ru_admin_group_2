package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_6;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    public String getRuleName() {
        return ruleName;
    }
}