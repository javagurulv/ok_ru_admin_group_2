package student_andrey_domas.lesson_8_single_responsibility_principle_optional;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sidney");
    }

}