package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_6;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().equals("Германия") && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }

}
