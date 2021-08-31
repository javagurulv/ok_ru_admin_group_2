package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_5;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }

}

