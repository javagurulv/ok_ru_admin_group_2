package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_5;

class FraudDetector {

    FraudRule[] rules;

    FraudDetector(FraudRule[] rules) {
        this.rules = rules;
    }

    boolean isFraud(FraudRule[] rules, Transaction t) {
        for (FraudRule i: rules) {
            if (i.isFraud(t)) {
                return true;
            }
        }
        return false;
    }

}
