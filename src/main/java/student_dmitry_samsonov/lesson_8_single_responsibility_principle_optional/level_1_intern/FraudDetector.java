package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudDetector {
    private FraudRule[] rules;
    FraudDetector(FraudRule[] rules) {
        this.rules = rules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(false, null);
        for (FraudRule rule: this.rules) {
            if (rule.isFraud(t).isFraud()) {
                fraudDetectionResult.setFraud(true);
                fraudDetectionResult.setRuleName(rule.getRuleName());
                System.out.println("Fraud detected: " + t);
                return fraudDetectionResult;
            }
        }
        return fraudDetectionResult;
    }
}
