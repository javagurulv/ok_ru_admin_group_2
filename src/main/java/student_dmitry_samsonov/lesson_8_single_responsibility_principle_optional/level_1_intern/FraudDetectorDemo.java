package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudDetectorDemo {
    public static void main(String[] args) {
        FraudRule1 fraudRule1 = new FraudRule1();
        FraudRule2 fraudRule2 = new FraudRule2();
        FraudRule3 fraudRule3 = new FraudRule3();
        FraudRule4 fraudRule4 = new FraudRule4();
        FraudRule5 fraudRule5 = new FraudRule5();
        FraudRule[] fraudRules = {fraudRule1, fraudRule2, fraudRule3, fraudRule4, fraudRule5};
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Pokemon", "City", "Country");
        Transaction transaction = new Transaction(trader, 1);
        fraudDetector.isFraud(transaction);
    }
}
