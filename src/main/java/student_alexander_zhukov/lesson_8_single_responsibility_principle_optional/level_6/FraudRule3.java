package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_6;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equals("Сидней")) {
            return true;
        }
        return false;
    }

}
