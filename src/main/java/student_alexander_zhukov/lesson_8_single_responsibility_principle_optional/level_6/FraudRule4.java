package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_6;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().equals("Ямайка")) {
            return true;
        }
        return false;
    }

}
