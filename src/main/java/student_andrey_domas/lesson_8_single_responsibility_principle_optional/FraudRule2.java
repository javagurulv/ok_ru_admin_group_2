package student_andrey_domas.lesson_8_single_responsibility_principle_optional;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getAmount() >= 1000000;
    }

}