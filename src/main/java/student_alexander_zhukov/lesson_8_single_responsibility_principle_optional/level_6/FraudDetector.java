package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_6;

class FraudDetector {

    FraudRule[] rules;

    FraudDetector(FraudRule[] rules) {
        this.rules = rules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        FraudDetectionResult detect = new FraudDetectionResult(false, null);
        for (FraudRule i: rules) {
            if (i.isFraud(t)) {
                detect.setFraud(true);
                detect.setRuleName(i.getRuleName());
                System.out.println("Fraud detected: " + t);
                return detect;
            }
        }
        return detect;
    }

}
