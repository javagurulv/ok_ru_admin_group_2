package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_5;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}