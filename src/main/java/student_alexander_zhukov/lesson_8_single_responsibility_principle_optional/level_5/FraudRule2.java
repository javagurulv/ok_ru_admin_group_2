package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_5;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }

}
