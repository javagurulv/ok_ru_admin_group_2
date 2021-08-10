package student_andrey_domas.lesson_8_single_responsibility_principle_optional;

public class FraudDetector {

    FraudRule[] rules;

    public FraudDetector(FraudRule[] rules) {
        this.rules = rules;
    }

    public FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule rule: rules) {
            if (rule.isFraud(t))
                return new FraudDetectionResult(true, rule.getRuleName());
        }
        return new FraudDetectionResult(false, null);
    }

}